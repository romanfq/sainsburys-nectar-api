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
public class NectarOffer {

    @SerializedName("treatment_code")
    private String treatmentCode;
    @SerializedName("coupon_id")
    private String couponId;
    @SerializedName("sponsor_id")
    private String sponsorId;
    @SerializedName("sponsor_image_code")
    private String sponsorImageCode;
    @SerializedName("opted_in")
    private boolean optedIn;
    @SerializedName("offer_id")
    private String offerId;
    @SerializedName("progress_text")
    private String progress_text;
    @SerializedName("isExclusive")
    private boolean isExclusive;
    @SerializedName("terms_conditions")
    private String termsAndConditions;
    @SerializedName("offer_points")
    private String offerPoints;
    @SerializedName("opt_in_type")
    private String optInType;
    @SerializedName("offer_description")
    private String offerDescription;
    @SerializedName("product_image_code")
    private String productImageCode;
    @SerializedName("redemption_status")
    private String redemptionStatus;
    @SerializedName("valid_from")
    private String validFrom;
    @SerializedName("valid_till")
    private String validTill;
    @SerializedName("offer_type")
    private String offerType;
    @SerializedName("offer_date_type")
    private String offerDateType;
    @SerializedName("hasOfferBeenRead")
    private boolean hasOfferBeenRead;
    @SerializedName("pseudo_opted_in")
    private boolean pseudoOptedIn;

    private String offer_message_1;
    private String offer_message_2;
    private String offer_message_3;
    private String offer_message_4;
    private String offer_message_5;

    public String getTreatmentCode() {
        return treatmentCode;
    }

    public String getCouponId() {
        return couponId;
    }

    public String getSponsorId() {
        return sponsorId;
    }

    public String getSponsorImageCode() {
        return sponsorImageCode;
    }

    public boolean isOpted_in() {
        return optedIn;
    }

    public String getOfferId() {
        return offerId;
    }

    public String getProgressTest() {
        return progress_text;
    }

    public boolean isIsExclusive() {
        return isExclusive;
    }

    public String getTermsAndConditions() {
        return termsAndConditions;
    }

    public String getOffer_points() {
        return offerPoints;
    }

    public String getOpt_in_type() {
        return optInType;
    }

    public String getOfferDescription() {
        return offerDescription;
    }

    public String getProductImageCode() {
        return productImageCode;
    }

    public String getRedemption_status() {
        return redemptionStatus;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public String getValidTill() {
        return validTill;
    }

    public String getOfferType() {
        return offerType;
    }

    public String getOfferDateType() {
        return offerDateType;
    }

    public boolean hasOfferBeenRead() {
        return hasOfferBeenRead;
    }

    public boolean isPseudo_opted_in() {
        return pseudoOptedIn;
    }

    public String getOffer_message_1() {
        return offer_message_1;
    }

    public String getOffer_message_2() {
        return offer_message_2;
    }

    public String getOffer_message_3() {
        return offer_message_3;
    }

    public String getOffer_message_4() {
        return offer_message_4;
    }

    public String getOffer_message_5() {
        return offer_message_5;
    }

    public String getOfferMessage() {
        StringBuilder offerMessage = new StringBuilder();

        String message = (offer_message_1 != null ? offer_message_1 + " " : "");
        offerMessage.append(message);

        message = (offer_message_2 != null ? offer_message_2 + " " : "");
        offerMessage.append(message);

        message = (offer_message_3 != null ? offer_message_3 + " " : "");
        offerMessage.append(message);

        message = (offer_message_4 != null ? offer_message_4 + " " : "");
        offerMessage.append(message);

        message = (offer_message_5 != null ? offer_message_5 + " " : "");
        offerMessage.append(message);

        return offerMessage.toString();
    }
}
