package com.fongmi.android.tv.bean;

import com.google.gson.annotations.SerializedName;

public class Core {

    @SerializedName("auth")
    private String auth;
    @SerializedName("name")
    private String name;
    @SerializedName("pass")
    private String pass;

    public String getAuth() {
        return auth;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }
}
