package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.ProductPage;
import pages.SearchResultsPage;

public class ProductPageSteps
{
    SearchResultsPage searchResultsPage = PageFactory.initElements(DriverFactory.getDriver(), SearchResultsPage.class);
    ProductPage productPage;
    @Given("User should be on the product page")
    public void user_should_be_on_the_product_page()
    {
        productPage = searchResultsPage.openProductPage();
    }
    @When("user is on the product page")
    public void userIsOnTheProductPage()
    {
        productPage.switchToProductPage();
    }
    @When("user clicks the add to cart button")
    public void user_clicks_the_add_to_cart_button() {

        productPage.addToCart();
    }
    @Then("product should be added to cart")
    public void product_should_be_added_to_cart()
    {

    }

}
