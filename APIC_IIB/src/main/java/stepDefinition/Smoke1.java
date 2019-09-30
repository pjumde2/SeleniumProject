package stepDefinition;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Smoke1 extends LaunchApp {
	
	@Given("^I open website$")
	public void i_open_website() throws Throwable {
		Launch();
	   
	}

	@When("^I enter valid FirstName and valid LastName$")
	public void i_enter_valid_FirstName_and_valid_LastName() throws Throwable {
	    
		driver.findElement(By.name("firstName")).sendKeys("Ramesh");
		driver.findElement(By.name("lastName")).sendKeys("Suresh");
	}

}
