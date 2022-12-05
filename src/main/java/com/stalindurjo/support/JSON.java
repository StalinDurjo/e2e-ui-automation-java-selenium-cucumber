package com.stalindurjo.support;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public abstract class JSON {

    /** readJsonFile() - reads json data and returns the value in JSON format */
    public static JsonNode readJsonFile(String src){
        FileInputStream fis;
        String jsonData;
        ObjectMapper objectMapper;
        JsonNode jsonNode = null;

        try{
            fis = new FileInputStream(src);
            jsonData = IOUtils.toString(fis, StandardCharsets.UTF_8);
            objectMapper = new ObjectMapper();
            jsonNode = objectMapper.readTree(jsonData);
        }catch (Exception e){
            Print.errorMessage(e.getMessage());
        }

        return Objects.requireNonNull(jsonNode);
    }
}
