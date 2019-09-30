package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchApp {

public static WebDriver driver=null;
	
	public static  WebDriver Launch()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\\\Sel_Training\\\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		//System. setProperty("webdriver.chrome.driver", "C:\\chromedriver_mac64\\chromedriver.exe");
		// Initialize browser.
		//WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=f9e334e7eaa1faeb3ed2194bcaac0a2e");
		return driver;
	}
}
