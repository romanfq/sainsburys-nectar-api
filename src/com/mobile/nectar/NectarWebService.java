/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mobile.nectar;

import java.io.BufferedReader;
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
    private final static String USER_AGENT = "SainsburysMobileApp/1.0.0 (Android/ABC100-1; Mobile/3.2.1.0; en_GB; 0012345678912)";

    /*
     Offers data found at: https://mobile.nectar.com/nectar-loyalty-api/collectors/<CARD ID>/offers
     */
    protected static String getOffersData(String offers_uri, String basicAuthToken) throws IOException {
        String offersData = connect(ENDPOINT_BASE + offers_uri, basicAuthToken);
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
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
        setHeaders(con, basicAuthToken);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String offersData = in.readLine(); //Successfull invocation of the web service will see JSON in the HTTP response body
        in.close();
        return offersData;
    }
}
