package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Swag_lab {
	WebDriver driver;

	@Given("I launch chrome browser")
	public void i_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@When("I open SwagLab homepage")
	public void i_open_orange_hrm_homepage() throws InterruptedException {
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}

	@Then("I verify that the logo on page")
	public void i_verify_that_the_logo_on_page() {
		boolean ba = driver.findElement(By.xpath("//div[@class='login_logo']")).isDisplayed();
		Assert.assertEquals(true, ba);
		
	}

	@And("close browser")
	public void close_browser() {
		driver.close();
	}

}
