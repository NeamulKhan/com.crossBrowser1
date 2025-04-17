package pageActioncrossBrowser1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pageLocatorcrossBrowser1.MensWatchpageLocatorcrossBrowser1;
import utilitycrossBrowser1.BaseClasscrossBrowser1;

public class MensWatchpageActioncrossBrowser1 extends BaseClasscrossBrowser1 {

	
	MensWatchpageLocatorcrossBrowser1 mensWatchpageLocatorcrossBrowser1 = new MensWatchpageLocatorcrossBrowser1();
	

	public void user_enter_minimum_price_and_maximum_price_range(String x, String y) {
		
	
	//	Use JavaScript Instead of Actions,	For sliders, the most stable approach is to use JavaScript to set the slider position. 
		
		try {
			WebElement minPriceElement = wait.until(ExpectedConditions.visibilityOf(mensWatchpageLocatorcrossBrowser1.minimumPrice));	
			WebElement maxPriceElement = wait.until(ExpectedConditions.visibilityOf(mensWatchpageLocatorcrossBrowser1.maximumPrice));
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
									
		   // Move min slider
			js.executeScript("arguments[0].setAttribute('style', 'left: " + Integer.parseInt(x) + "px;')", minPriceElement);
			
			// Move max slider
			js.executeScript("arguments[0].setAttribute('style', 'right: " + Integer.parseInt(y) + "px;')",  maxPriceElement);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
		
	/*	
		 * ✅ Key Issues in Your Code:
You're using dragAndDropBy(...) on a price range slider.

This is very flaky and often breaks on custom sliders because the HTML structure doesn't support native drag behavior.

Also, some sliders only respond properly to JavaScript-based movement.

You’re passing offsets (x, y) from the .properties file.

That's okay if those numbers are correct offsets in pixels, but depending on the screen resolution and slider behavior, they might be inaccurate.

🔧 Recommended Fix: Use JavaScript Instead of Actions
For sliders, the most stable approach is to use JavaScript to set the slider position. Here's how:


		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		/*	WebElement minPriceElement;
		WebElement maxPriceElement;
		try {
			minPriceElement = wait.until(ExpectedConditions.visibilityOf(mensWatchpageLocatorcrossBrowser1.minimumPrice));	
			maxPriceElement = mensWatchpageLocatorcrossBrowser1.maximumPrice;
			
			Actions act = new Actions(driver);
			act.dragAndDropBy(minPriceElement, Integer.parseInt(x), 0).perform();
			act.dragAndDropBy(maxPriceElement, Integer.parseInt(y), 0).perform();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		*/
		
		
		
		
		
	/*	// Move sliders using JavaScriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Move min slider 50px to the right
		js.executeScript(
		    "arguments[0].style.left = (parseFloat(arguments[0].style.left || '0') + 50) + 'px';", minPriceElement );

		// Move max slider 50px to the left
		js.executeScript(
		    "arguments[0].style.left = (parseFloat(arguments[0].style.left || '0') - 50) + 'px';", maxPriceElement );
		
		*/
		
		
	
	

	
	/*
	public void user_enter_minimum_price() {
		
		Actions act = new Actions (driver);	
		WebElement minPriceElement = wait.until(ExpectedConditions.visibilityOf(mensWatchpageLocatorcrossBrowser1.minimumPrice));		
		act.dragAndDropBy(minPriceElement, 50,0).perform();
	}
		
	public void user_enter_maximum_price() {
		
	//	Actions act = new Actions (driver);
	//	WebElement maxPriceElement = wait.until(ExpectedConditions.visibilityOf(mensWatchpageLocatorcrossBrowser1.maximumPrice));
	//	act.dragAndDropBy(maxPriceElement, 0,-200).perform();
	
	//	act.dragAndDropBy(mensWatchpageLocatorcrossBrowser1.maximumPrice, -200,0);
		
		
		// Move max slider 50px to the left
		
	//	WebElement maxPriceElement = mensWatchpageLocatorcrossBrowser1.maximumPrice;
		
		WebElement maxPriceElement = wait.until(ExpectedConditions.visibilityOf(mensWatchpageLocatorcrossBrowser1.maximumPrice));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript(
		    "arguments[0].style.left = (parseFloat(arguments[0].style.left || '0') -300) + 'px';",
		    maxPriceElement);
	}
	

		
	}*/
	
	
	

