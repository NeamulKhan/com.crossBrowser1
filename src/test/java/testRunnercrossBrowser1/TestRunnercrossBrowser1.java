package testRunnercrossBrowser1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilitycrossBrowser1.BaseClasscrossBrowser1;



@CucumberOptions(features= {"src/test/resource/featureFoldercrossBrowser1"},
plugin={"json:target/cucumber.json"},
glue="stepDefinationcrossBrowser1", tags= "@PriceRange" , //"@Search", // "@Registration3" , // "@Registration2" , //"@Registration", 

//dryRun = true,
monochrome = true,
publish = true
		)


public class TestRunnercrossBrowser1 extends AbstractTestNGCucumberTests {
	
	 private BaseClasscrossBrowser1 test; // Create an instance variable
	 
	 
	@BeforeTest
	
	public void setUp() {
			
		test = new BaseClasscrossBrowser1(); // Initialize the instance variable
        test.crossBrowser1_initializeDriver();
	}
	
	@AfterTest
	
	public void tearDown() {
		
	//	BaseClasscrossBrowser1.closeDriver(); // Use the static closeDriver method
		BaseClasscrossBrowser1.driver.quit();
	}

}
