package com.stalindurjo.support.test_data;

import com.fasterxml.jackson.databind.JsonNode;
import com.stalindurjo.support.Configuration;
import com.stalindurjo.support.JSON;
import com.stalindurjo.support.Print;

import java.util.Objects;

public class UserTestData extends JSON {
    private final JsonNode testData;
    private final ACCOUNT_TYPE accountType;

    public UserTestData(ACCOUNT_TYPE accountType){
        testData = readJsonFile(Configuration.jsonTestDataDirectory("data.json"));
        this.accountType = accountType;
    }

    public String get(String property){
        String data = null;
        String type = String.valueOf(accountType);

        for(JsonNode user : testData.get("users")){
            if(user.get("account_type").asText().equals(type)){
                if(user.get(property) == null)
                    Print.errorMessage("Returned null - value \"" + property + "\" is incorrect");
                data = user.get(property).asText();
            }
        }

        return Objects.requireNonNull(data);
    }
}
