package pages;

import factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage
{
    WebDriver driver;

    @FindBy(how = How.PARTIAL_LINK_TEXT, using = "LG 1.5 Ton 5 Star")
    WebElement product;

    public ProductPage openProductPage()
    {
        product.click();
        return PageFactory.initElements(DriverFactory.getDriver(), ProductPage.class);
    }
}