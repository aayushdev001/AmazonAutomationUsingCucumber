package testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/AppFeatures/CartPage.feature"},
        glue = {"stepdefinitions", "AppHooks"},
        plugin = {"pretty"


        }

)
public class MyTestRunner
{
}
