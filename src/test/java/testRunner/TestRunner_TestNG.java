package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features/SwagLabs.feature",
		glue = {"stepDefinations"},
		monochrome=true
		)
public class TestRunner_TestNG extends AbstractTestNGCucumberTests {

}
