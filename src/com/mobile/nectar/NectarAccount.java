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
    private String points_balance;
    @SerializedName("monetary_value")
    private String monetary_value;
    @SerializedName("account_type")
    private String account_type;

    public String getName() {
        return name;
    }

    public String getCurrency() {
        return currency;
    }

    public String getPoints_balance() {
        return points_balance;
    }

    public String getMonetary_value() {
        return monetary_value;
    }

    public String getAccount_type() {
        return account_type;
    }

}
