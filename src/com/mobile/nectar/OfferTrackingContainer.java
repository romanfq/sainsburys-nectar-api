/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mobile.nectar;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aboulton
 */
public class OfferTrackingContainer {

    @SerializedName("track_offers")
    private List<OfferTracking> trackOffers = new ArrayList<>();

    public List<OfferTracking> getTrackingOffers() {
        return trackOffers;
    }
}
