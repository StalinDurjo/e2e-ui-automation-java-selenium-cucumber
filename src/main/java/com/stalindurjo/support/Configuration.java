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
            System.out.println("Folder is missing or empty");
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
            System.out.println("Browser is null");

        return browser;
    }

    /** headless() - returns true or false */
    public static Boolean headless(){
        String headless = loadConfiguration().getProperty("headless");

        if(headless == null)
            System.out.println("Headless is null");

        return Boolean.parseBoolean(headless);
    }

}

