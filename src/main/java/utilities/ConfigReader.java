package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

     public  Properties properties = new Properties();

    public ConfigReader() throws IOException {
        File file = new File("/Users/admin/Developments/HonestFoodAutomation/src/main/resources/config.Properties");

        InputStream fileInputStream = new FileInputStream(file);
        properties.load(fileInputStream);
    }

    public String getUrl() {
        return properties.getProperty("base_url");
    }
}
