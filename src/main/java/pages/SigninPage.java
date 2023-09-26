package pages;

import factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SigninPage
{
    WebDriver driver;

    public SigninPage(WebDriver driver)
    {
        this.driver = driver;
    }
    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-link-accountList\"]")
    WebElement signinTab;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-flyout-ya-signin\"]/a/span")
    WebElement signInButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ap_email\"]")
    WebElement emailTextBox;

    @FindBy(how = How.XPATH, using = "//*[@id=\"continue\"]")
    WebElement emailSubmitButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ap_password\"]")
    WebElement passwordTextBox;

    @FindBy(how = How.XPATH, using = "//*[@id=\"signInSubmit\"]")
    WebElement signInSubmitButton;

    public void openSignInWindow()
    {
        Actions builder = new Actions(driver);
        builder.moveToElement(signinTab).build().perform();
        signInButton.click();
    }
    public void setUsername(String username)
    {
        emailTextBox.sendKeys(username);
        emailSubmitButton.click();
    }

    public void setPassword(String password)
    {
        passwordTextBox.sendKeys(password);
    }
    public void submitSignIn()
    {
        signInSubmitButton.click();
    }
    public String getTitle()
    {
       return driver.getTitle();
    }

    public HomePage doLogin(String username, String password)
    {
        Actions builder = new Actions(driver);
        builder.moveToElement(signinTab).build().perform();
        signInButton.click();
        emailTextBox.sendKeys(username);
        emailSubmitButton.click();
        passwordTextBox.sendKeys(password);
        signInSubmitButton.click();
        return PageFactory.initElements(DriverFactory.getDriver(), HomePage.class);
    }
}
