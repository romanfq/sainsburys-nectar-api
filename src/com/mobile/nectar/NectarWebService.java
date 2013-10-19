/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mobile.nectar;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/**
 *
 * @author Adam Boulton
 */
class NectarWebService {

    private final static String ENDPOINT_BASE = "https://mobile.nectar.com/nectar-loyalty-api/collectors/";
    private final static String OFFERS_URL = ENDPOINT_BASE + "%s/offers";
    private final static String OPT_IN_URL = ENDPOINT_BASE + "%s/offers/batch";
    private final static String TRACK_OFFER_URL = ENDPOINT_BASE + "%s/offertracking/batch";
    private final static String USER_AGENT = "SainsburysMobileApp/2.10.0 (Android/ABC100-1; Mobile/3.2.1.0; en_GB; 0012345678912)";

    private final static Gson gson = new Gson();

    /*
     Offers data found at: https://mobile.nectar.com/nectar-loyalty-api/collectors/<CARD ID>/offers
     */
    protected static String getOffersData(String cardNumber, String basicAuthToken) throws IOException {
        String offersUrl = String.format(OFFERS_URL, cardNumber);
        String offersData = connect(offersUrl, basicAuthToken);
        return offersData;
    }

    /*
     Initiate a HTTP GET request to retrieve the Nectar account information
     Profile data found at: https://mobile.nectar.com/nectar-loyalty-api/collectors/<CARD ID>
     */
    protected static String getProfileData(String login_uri, String basicAuthToken) throws IOException {
        String jsonProfileData = connect(ENDPOINT_BASE + login_uri, basicAuthToken);
        return jsonProfileData;
    }

    protected static void optInToOffer(String cardNumber, String basicAuthToken, OptInOffer optInOffer, OfferTracking offerTrack) throws IOException {
        String optInUrl = String.format(OPT_IN_URL, cardNumber);
        String trackingUrl = String.format(TRACK_OFFER_URL, cardNumber);

        OptInOfferContainer container = new OptInOfferContainer();
        container.getOpt_ins().add(optInOffer);

        OfferTrackingContainer trackingContainer = new OfferTrackingContainer();
        trackingContainer.getTrackingOffers().add(offerTrack);

        postOptInOffer(optInUrl, basicAuthToken, gson.toJson(container));
        postTrackOffer(trackingUrl, basicAuthToken, gson.toJson(trackingContainer));
    }

    /*
     Headers that the web service expects
     */
    private static void setHeaders(HttpsURLConnection con, String basicAuthToken) throws ProtocolException {
        con.setRequestMethod("GET");
        con.setRequestProperty("Authorization", "Basic " + basicAuthToken);
        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Date", NectarUtils.getDateTimeStamp());
    }

    //Makes a simple GET request, returning any data in the response body.
    private static String connect(String url, String basicAuthToken) throws IOException, ProtocolException, MalformedURLException {
        URL urlObj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) urlObj.openConnection();
        setHeaders(con, basicAuthToken);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String offersData = in.readLine(); //Successfull invocation of the web service will see JSON in the HTTP response body
        in.close();
        return offersData;
    }

    /**
     * Opts into an offer
     *
     * @param url - The endpoint for the offer
     * @param basicAuthToken
     */
    private static void postOptInOffer(String url, String basicAuthToken, String optInJsonData) throws MalformedURLException, IOException {
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
        con.setRequestMethod("POST");
        con.setDoOutput(true);
        setHeaders(con, basicAuthToken);

        //One additional header required when doing opting into offers.
        con.addRequestProperty("Content-Type", "application/vnd.com.nectar_1+json");
        try (DataOutputStream output = new DataOutputStream(con.getOutputStream())) {
            output.writeBytes(optInJsonData);
            output.flush();
        }
    }

    private static void postTrackOffer(String url, String basicAuthToken, String optInJsonData) throws MalformedURLException, IOException {
        {
            URL obj = new URL(url);
            HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
            con.setRequestMethod("POST");
            con.setDoOutput(true);
            setHeaders(con, basicAuthToken);

            con.addRequestProperty("Content-Type", "application/vnd.com.nectar_1+json");

            try (DataOutputStream output = new DataOutputStream(con.getOutputStream())) {
                output.writeBytes(optInJsonData);
                output.flush();
            }
        }
    }

}
