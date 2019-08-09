package util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public final class JsonDataReader {

    public static Map<String, String> getUserData() {
        CustomLogger.info("Getting user data");
        Map<String, String> user = null;
        try {
            user = new ObjectMapper().readValue(new File(PropertiesReader.getProperty("userData.path")),
                    new TypeReference<Map<String, String>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
            CustomLogger.error("Can't read userData.json file");
        }
        return user;
    }

    public static Map<String, String> getPersonData() {
        CustomLogger.info("Getting person data");
        Map<String, String> person = null;
        try {
            person = new ObjectMapper().readValue(new File(PropertiesReader.getProperty("personData.path")),
                    new TypeReference<Map<String, String>>() {
                    });
        } catch (IOException e) {
            e.printStackTrace();
            CustomLogger.error("Can't read personData.json file");
        }
        return person;
    }

}


