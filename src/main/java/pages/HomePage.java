package pages;

import factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class HomePage
{
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@id=\"twotabsearchtextbox\"]")
    WebElement searchBox;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-search-submit-button\"]")
    WebElement searchSubmitButton;

    public void setSearchText(String searchText)
    {
        searchBox.sendKeys(searchText);
    }

    public void submitSearch()
    {
        searchSubmitButton.click();
    }
    public SearchResultsPage doSearch(String search)
    {
        searchBox.sendKeys(search);
        searchSubmitButton.click();
        return PageFactory.initElements(DriverFactory.getDriver(), SearchResultsPage.class);
    }
}
