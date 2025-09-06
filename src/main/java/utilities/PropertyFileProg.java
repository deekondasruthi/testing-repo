package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileProg {
	private static Properties prop = new Properties();

    public static void adminPropertyFile() {
        try (FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/credential.Properties")) {
            prop.load(ip);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load property file: " + e.getMessage());
        }
    }

    public static String getProperty(String key) {
        String value = prop.getProperty(key);
        if (value == null) {
            throw new IllegalArgumentException("Key not found in properties file: " + key);
        }
        return value;
    }
		
		
	}
	
	
	
	
	


