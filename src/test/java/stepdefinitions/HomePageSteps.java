package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import pages.SigninPage;

import java.util.List;
import java.util.Map;

public class HomePageSteps
{
    private HomePage homePage;
    private SigninPage signinPage = PageFactory.initElements(DriverFactory.getDriver(), SigninPage.class);

    
    @And("user enters {string} in the search box")
    public void userEntersInTheSearchBox(String arg0)
    {
        homePage.setSearchText(arg0);
    }
    @When("clicks on the search button")
    public void clicks_on_the_search_button() {
       homePage.submitSearch();
    }
    @Then("he should be taken to the search results page")
    public void he_should_be_taken_to_the_search_results_page()
    {

    }

    @Given("user has already signed into the application")
    public void userHasAlreadySignedIntoTheApplication(DataTable dataTable)
    {
        List<Map<String, String >> data = dataTable.asMaps();
        String username = data.get(0).get("username");
        String password = data.get(0).get("password");
        DriverFactory.getDriver().get("https://amazon.in");
        homePage = signinPage.doLogin(username, password);
    }
}
