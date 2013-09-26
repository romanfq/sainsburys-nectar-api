package com.mobile.nectar;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author Adam Boulton
 */
public final class Nectar {

    private String basicAuthToken;
    private NectarAccount profile;
    private List<NectarOffer> offers;

    private final String cardNumber, postcode, surname;

    public Nectar(String cardNumber, String postcode, String surname) throws IOException {
        this.cardNumber = cardNumber;
        this.postcode = postcode;
        this.surname = surname;

        login();
    }

    /**
     * Refreshes the details of the account using the authentication details
     */
    public void refesh() throws IOException {
        login();
    }

    public NectarAccount getAccount() {
        return profile;
    }

    public List<NectarOffer> getOffers() {
        return offers;
    }

    private void login() throws IOException {
        this.basicAuthToken = NectarUtils.createBasicAuthToken(cardNumber, postcode, surname);

        String jsonProfileData = NectarWebService.getProfileData(cardNumber, basicAuthToken);
        this.profile = NectarUtils.buildSainsburysProfile(jsonProfileData);

        String jsonOffersData = NectarWebService.getOffersData(cardNumber + "/offers", basicAuthToken);
        this.offers = NectarUtils.buildSainsburysOffers(jsonOffersData);
    }

}
