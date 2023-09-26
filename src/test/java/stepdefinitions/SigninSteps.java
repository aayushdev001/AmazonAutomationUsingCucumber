package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import pages.SigninPage;

public class SigninSteps
{
    private SigninPage signinPage = PageFactory.initElements(DriverFactory.getDriver(), SigninPage.class);
    private String title;

    @Given("user is on Home page")
    public void userIsOnHomePage()
    {
        DriverFactory.getDriver().get("https://amazon.in");
    }

    @When("user opens sign in window")
    public void userOpensSignInWindow()
    {
        signinPage.openSignInWindow();
    }

    @And("user enters username as {string}")
    public void userEntersUsernameAs(String arg0)
    {
        signinPage.setUsername(arg0);
    }

    @When("user enters password as {string}")
    public void user_enters_password_as(String string) {
        signinPage.setPassword(string);
    }

    @When("user clicks on signin button")
    public void user_clicks_on_signin_button() {
        signinPage.submitSignIn();
    }

    @Then("user should be signedin")
    public void userShouldBeSignedin()
    {
        title = signinPage.getTitle();
    }

    @Then("title should be {string}")
    public void title_should_be(String string)
    {

        Assert.assertEquals(string, signinPage.getTitle());
    }
}
