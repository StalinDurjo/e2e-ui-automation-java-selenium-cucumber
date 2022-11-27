package com.stalindurjo.support;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public final class Configuration {
    /** loadConfiguration() - returns all configuration found in config folder with the extension .properties */
    private static Properties loadConfiguration(){
        Properties properties = new Properties();
        String path = System.getProperty("user.dir") + "/config";

        File folder = new File(path);
        File[] fileList = folder.listFiles();

        if(fileList == null || fileList.length == 0) {
            Print.errorMessage("Folder is missing or empty");
        }
        else {
            try {
                for (File file : fileList) {
                    properties.load(new FileInputStream(file));
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return Objects.requireNonNull(properties);
    }


    /** browser() - returns the name of browser defined in .properties */
    public static String browser(){
        String browser = loadConfiguration().getProperty("browser");

        if(browser == null)
            Print.errorMessage("Browser is null");

        return browser;
    }

    /** headless() - returns true or false */
    public static Boolean headless(){
        String headless = loadConfiguration().getProperty("headless");

        if(headless == null)
            Print.errorMessage("Headless is null");

        return Boolean.parseBoolean(headless);
    }

    /** baseUrl() - returns URL defined in .properties */
    public static String baseUrl(){
        String baseUrl = loadConfiguration().getProperty("base_url");

        if(baseUrl == null)
            Print.errorMessage("Base URL is null");

        return baseUrl;
    }

    /** timeout() - returns timeout number defined in .properties */
    public static Integer timeout(){
        String timeout = loadConfiguration().getProperty("timeout");

        if(timeout == null)
            Print.errorMessage("Timeout is null");

        return Integer.parseInt(Objects.requireNonNull(timeout));

    }

    /** parallel() - returns true or false */
    public static boolean parallel(){
        String parallel = loadConfiguration().getProperty("parallel");

        if(parallel == null)
            Print.errorMessage("Parallel is null");

        return Boolean.parseBoolean(parallel);
    }

    /** jsonTestDataDirectory() - returns the test_data json directory located in project root 'data/**' directory */
    public static String jsonTestDataDirectory(String filename){
        String testData = loadConfiguration().getProperty("test_data.json.dir");

        if(testData == null)
            Print.errorMessage("Test data directory is null");

        return System.getProperty("user.dir") + "\\" + testData + "\\" + filename;
    }

}

