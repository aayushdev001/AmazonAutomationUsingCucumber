package AppHooks;

import factory.DriverFactory;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import util.ConfigReader;

import java.io.IOException;
import java.util.Properties;

public class ApplicationHooks
{
    private DriverFactory driverFactory;
    private WebDriver driver;
    private ConfigReader configReader;
    Properties prop;

    @Before(order = 0)
    public void getProperty() throws IOException
    {
        configReader = new ConfigReader();
        prop = configReader.intializeProp();
    }

    @Before(order = 1)
    public void setBrowserAndDriver()
    {
        String browser = prop.getProperty("browser");
        driverFactory = new DriverFactory();
        driverFactory.initializeDriver(browser);
        driver = driverFactory.getDriver();
    }

}
