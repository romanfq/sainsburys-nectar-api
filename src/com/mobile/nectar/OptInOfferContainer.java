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
 * @author Adam Boulton
 * Class used as a container for preparing the POST message contents when opting into an offer.
 * An example of the POST message contents looks like:
 * 
 * {
   "opt_ins" : [
      {
         "offer_id" : "01B00ZSK82",
         "opted_in" : "true",
         "treatment_code" : "001635427"
      }
   ]
}
 */
final class OptInOfferContainer {
    @SerializedName("opt_ins")
    private List<OptInOffer> optInOffers = new ArrayList<>();

    public List<OptInOffer> getOpt_ins() {
        return optInOffers;
    }
}
