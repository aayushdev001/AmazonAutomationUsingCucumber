package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory
{
    public static WebDriver driver;

    public void initializeDriver(String browser)
    {
        if(browser.equals("chrome"));
        {
            System.setProperty("webdriver.chrome.driver", "H:\\Downloads\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
    }
    public static WebDriver getDriver()
    {
        return driver;
    }
}
