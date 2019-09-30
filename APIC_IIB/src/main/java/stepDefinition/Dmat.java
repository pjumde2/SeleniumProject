package stepDefinition;



import java.util.List;

import org.openqa.selenium.By;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import junit.framework.Assert;

public class Dmat extends LaunchApp{
	
	@Given("^I enter valid data on page$")
	public void i_enter_valid_data_on_page(DataTable table) throws Throwable {
	    
		List<List<String>> data = table.raw();
	      
		driver.findElement(By.name("firstName")).sendKeys(data.get(1).get(1));
		driver.findElement(By.name("lastName")).sendKeys(data.get(2).get(1));
		//Assert.assertEquals(13, 12);
		
	}

}
