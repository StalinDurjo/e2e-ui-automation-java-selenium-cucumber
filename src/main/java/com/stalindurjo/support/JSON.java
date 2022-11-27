package com.stalindurjo.support;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class JSON {

    /** readJsonFile() - reads json data and returns the value */
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
            System.out.println(e.getMessage());
        }

        return Objects.requireNonNull(jsonNode);
    }
}
