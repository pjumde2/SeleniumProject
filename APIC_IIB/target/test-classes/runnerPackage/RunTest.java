package runnerPackage;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@RunWith(Cucumber.class)
//@Cucumber.Options(format = {"pretty", "html:target/cucumber"},features="featurePackage")
@CucumberOptions(plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},features="src/test/java",glue="stepDefinition", tags = {"@SmokeTest"})
public class RunTest {
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("C:\\Pramod_Selenium_Projects\\APIC_IIB\\src\\test\\java\\extent-config.xml"));
	}

}     
