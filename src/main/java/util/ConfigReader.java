package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader
{
    private Properties prop;

    public Properties intializeProp() throws IOException
    {
        prop = new Properties();
        FileInputStream ip = new FileInputStream("./src/test/resources/config/config.properties");
        prop.load(ip);
        return prop;
    }
}
