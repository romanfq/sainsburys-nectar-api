/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mobile.nectar;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Adam Boulton
 */
public class NectarUtils {

    public static String createBasicAuthToken(String cardNumber, String username, String password) {
        String credentials = String.format("%s:%s|%s", cardNumber, username, password);
        return new sun.misc.BASE64Encoder().encode(credentials.getBytes());
    }

    public static String getDateTimeStamp() {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
        String date = sdf.format(new Date());
        return date;
    }

    /*Takes a JSON string and converts into a SainsburysProfile POJO
     For example: {"name":"Justin King","currency":"GBP","points_balance":292834,"monetary_value":"599.76","account_type":"C"}
     */
    public static NectarAccount buildSainsburysProfile(String jsonProfile) throws JsonSyntaxException {
        Gson gson = new Gson();
        NectarAccount profile = gson.fromJson(jsonProfile, NectarAccount.class);
        return profile;
    }

    /*
    Takes the JSON string of offers and builds the pojos
    */
    public static List<NectarOffer> buildSainsburysOffers(String jsonOffers) throws JsonSyntaxException {
        Gson gson = new Gson();
        NectarOffers offers = gson.fromJson(jsonOffers, NectarOffers.class);
        return offers.getOffers();
    }
}
