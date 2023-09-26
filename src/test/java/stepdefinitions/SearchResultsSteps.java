package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import pages.SearchResultsPage;

import javax.naming.directory.SearchResult;

public class SearchResultsSteps
{
    SearchResultsPage searchResultsPage;
    HomePage homePage = PageFactory.initElements(DriverFactory.getDriver(), HomePage.class);
    @Given("user is on the search results page of {string} search")
    public void userIsOnTheSearchResultsPageOfSearch(String arg0)
    {
        searchResultsPage = homePage.doSearch(arg0);
    }
    @When("user clicks on the product")
    public void user_clicks_on_the_product()
    {
        searchResultsPage.openProductPage();
    }
    @Then("user should land on the product page")
    public void user_should_land_on_the_product_page()
    {

    }


}
