/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mobile.nectar;

import java.util.ArrayList;
import java.util.List;

/**
 * A container for the JSON feed of offers.
 * @author Adam Boulton
 */
 class NectarOffers {
    ArrayList<NectarOffer> offers;

    public List<NectarOffer> getOffers() {        
        return offers;
    }        
}
