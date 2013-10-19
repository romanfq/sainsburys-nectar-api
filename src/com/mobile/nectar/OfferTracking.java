/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mobile.nectar;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author aboulton
 */
public class OfferTracking {

    @SerializedName("activity")
    private String activity;

    @SerializedName("treatment_code")
    private String treatmentCode;

    @SerializedName("offer_id")
    private String offerId;

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getTreatmentCode() {
        return treatmentCode;
    }

    public void setTreatmentCode(String treatmentCode) {
        this.treatmentCode = treatmentCode;
    }

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }
    
    
    
}
