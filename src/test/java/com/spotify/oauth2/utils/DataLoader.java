package com.spotify.oauth2.utils;

import java.util.Properties;

public class DataLoader {
    private final Properties properties;
    private static DataLoader dataLoader;

    private DataLoader() {
        properties = PropertyUtils.propertyLoader("src/test/resources/data.properties");
    }

    public static DataLoader getInstance() {
        if (dataLoader == null) {
            dataLoader = new DataLoader();
        }
        return dataLoader;
    }

    public String getPlaylistId() {
        String prop = properties.getProperty("get_playlist_id");
        if (prop != null) {
            return prop;
        } else {
            throw new RuntimeException("property get_playlist_id is  not specified in the data.properties file!");
        }
    }

    public String getUpdatedPlaylistId() {
        String prop = properties.getProperty("updated_playlist_id");
        if (prop != null) {
            return prop;
        } else {
            throw new RuntimeException("property updated_playlist_id is not specified in the data.properties file!");
        }
    }

}
