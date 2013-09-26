/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mobile.nectar;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author Adam Boulton
 * 
 */
final class OptInOffer {

    @SerializedName("offer_id")
    private String offer_id;

    @SerializedName("opted_in")
    private String opted_in;

    @SerializedName("treatment_code")
    private String treatment_code;

    public String getOffer_id() {
        return offer_id;
    }

    public void setOffer_id(String offer_id) {
        this.offer_id = offer_id;
    }

    public String getOpted_in() {
        return opted_in;
    }

    public void setOpted_in(String opted_in) {
        this.opted_in = opted_in;
    }

    public String getTreatment_code() {
        return treatment_code;
    }

    public void setTreatment_code(String treatment_code) {
        this.treatment_code = treatment_code;
    }
    
    
}
