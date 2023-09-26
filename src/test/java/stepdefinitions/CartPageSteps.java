package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.CartPage;
import pages.ProductPage;

public class CartPageSteps
{
    ProductPage productPage = PageFactory.initElements(DriverFactory.getDriver(), ProductPage.class);
    CartPage cartPage;
    @Given("User should have moved to the cart page")
    public void user_should_have_moved_to_the_cart_page() {
        cartPage = productPage.moveToCartPage();
    }
    @When("user clicks on the checkout button")
    public void user_clicks_on_the_checkout_button() {
        cartPage.checkOut();
    }
    @Then("user should land on the checkout page")
    public void user_should_land_on_the_checkout_page() {

    }
}
