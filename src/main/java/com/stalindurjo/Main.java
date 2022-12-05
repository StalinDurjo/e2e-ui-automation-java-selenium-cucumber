package com.stalindurjo;

import com.stalindurjo.support.JSON;
import com.stalindurjo.support.test_data.ACCOUNT_TYPE;
import com.stalindurjo.support.test_data.UserTestData;

import static com.stalindurjo.support.test_data.ACCOUNT_TYPE.GENERAL_PURPOSE;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");
        UserTestData userTestData = new UserTestData(GENERAL_PURPOSE);
        System.out.println(userTestData.get("username"));

    }
}