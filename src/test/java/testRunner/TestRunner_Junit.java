package testRunner;

import org.junit.runner.RunWith;
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "eatures/SwagLabs.feature",
		glue = {"stepDefinations"},
		monochrome=true
		)
public class TestRunner_Junit {

}
