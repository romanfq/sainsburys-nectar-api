package com.mobile.nectar;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author Adam Boulton
 */
public class NectarAccount {

    @SerializedName("name")
    private String name;
    @SerializedName("currency")
    private String currency;
    @SerializedName("points_balance")
    private String pointsBalance;
    @SerializedName("monetary_value")
    private String monetaryValue;
    @SerializedName("account_type")
    private String accountType;

    public String getName() {
        return name;
    }

    public String getCurrency() {
        return currency;
    }

    public String getPoints_balance() {
        return pointsBalance;
    }

    public String getMonetary_value() {
        return monetaryValue;
    }

    public String getAccount_type() {
        return accountType;
    }

}
