package stepDefinationcrossBrowser1;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utilitycrossBrowser1.BaseClasscrossBrowser1;


public class HookcrossBrowser1 extends BaseClasscrossBrowser1{
	
	
	@After
	
	public void tearDown(Scenario scenario) {
		
		
		TakesScreenshot tss = (TakesScreenshot) driver;
		byte[] screenshot = tss.getScreenshotAs(OutputType.BYTES);
		
		if (scenario.isFailed()) {
			
			scenario.attach(screenshot, "image/png","Screenshot captured for failed scenario");
		}else {
			
			scenario.attach(screenshot, "image/png","Screenshot captured for passed scenario");
			
		//}catch (Exception e) {
		   
			
	//	}finally {
		}
		
			scenario.log("Test completed");
		}
	}
	
	

	


