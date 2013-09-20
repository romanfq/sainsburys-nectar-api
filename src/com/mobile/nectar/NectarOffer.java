/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mobile.nectar;

/**
 *
 * @author aboulton
 */
public class NectarOffer {

    private String treatment_code;
    private String coupon_id;
    private String sponsor_id;
    private String sponsor_image_code;
    private boolean opted_in;
    private String offer_id;
    private String progress_text;
    private boolean isExclusive;
    private String terms_conditions;
    private String offer_points;
    private String opt_in_type;
    private String offer_description;
    private String product_image_code;
    private String redemption_status;
    private String valid_from;
    private String valid_till;
    private String offer_type;
    private String offer_date_type;
    private boolean hasOfferBeenRead;
    private boolean pseudo_opted_in;

    private String offer_message_1;
    private String offer_message_2;
    private String offer_message_3;
    private String offer_message_4;
    private String offer_message_5;

    public String getTreatment_code() {
        return treatment_code;
    }

    public String getCoupon_id() {
        return coupon_id;
    }

    public String getSponsor_id() {
        return sponsor_id;
    }

    public String getSponsor_image_code() {
        return sponsor_image_code;
    }

    public boolean isOpted_in() {
        return opted_in;
    }

    public String getOffer_id() {
        return offer_id;
    }

    public String getProgress_text() {
        return progress_text;
    }

    public boolean isIsExclusive() {
        return isExclusive;
    }

    public String getTerms_conditions() {
        return terms_conditions;
    }

    public String getOffer_points() {
        return offer_points;
    }

    public String getOpt_in_type() {
        return opt_in_type;
    }

    public String getOffer_description() {
        return offer_description;
    }

    public String getProduct_image_code() {
        return product_image_code;
    }

    public String getRedemption_status() {
        return redemption_status;
    }

    public String getValid_from() {
        return valid_from;
    }

    public String getValid_till() {
        return valid_till;
    }

    public String getOffer_type() {
        return offer_type;
    }

    public String getOffer_date_type() {
        return offer_date_type;
    }

    public boolean isHasOfferBeenRead() {
        return hasOfferBeenRead;
    }

    public boolean isPseudo_opted_in() {
        return pseudo_opted_in;
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
