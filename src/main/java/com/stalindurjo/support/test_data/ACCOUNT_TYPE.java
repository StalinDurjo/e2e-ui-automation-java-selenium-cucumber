package com.stalindurjo.support.test_data;

public enum ACCOUNT_TYPE {
    GENERAL_PURPOSE("GENERAL_PURPOSE"),
    FIRST_TIME_USER("FIRST_TIME_USER");

    public final String accountType;

    ACCOUNT_TYPE(String accountType){
        this.accountType = accountType;
    }
}
