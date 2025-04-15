package pageActioncrossBrowser1;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pageLocatorcrossBrowser1.HomepageLocatorcrossBrowser1;
import utilitycrossBrowser1.BaseClasscrossBrowser1;


public class HomepageActioncrossBrowser1 extends BaseClasscrossBrowser1{
	
	 HomepageLocatorcrossBrowser1   homepageLocatorcrossBrowser1  = new  HomepageLocatorcrossBrowser1 ();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	public void verify_website_homepage_load_successfully() {
		
		// Wait for the logo to be visible
	    WebElement logoElement = wait.until(ExpectedConditions.visibilityOf(homepageLocatorcrossBrowser1.homePageLogo));
	    // Assert the logo is displayed
	    Assert.assertTrue(logoElement.isDisplayed(), "Logo is not displayed on the homepage!");
	}
	
	public void user_clicks_on_the_user_icon_and_the_Registration_link() {
		
		wait.until(ExpectedConditions.visibilityOf(homepageLocatorcrossBrowser1.userIcon)).click();
		wait.until(ExpectedConditions.visibilityOf(homepageLocatorcrossBrowser1.registerLink)).click();
	}
	
	public void user_should_be_navigated_to_the_registration_page() {
		
		WebElement registerLogoElement = wait.until(ExpectedConditions.visibilityOf(homepageLocatorcrossBrowser1.registerLogo));
		
		if (registerLogoElement.isDisplayed()) {
			
			highlightElement(registerLogoElement, "green"); //Highlight green if passed
			Assert.assertTrue(registerLogoElement.isDisplayed(), "Registration page is displyed successfully!");
		
		
		} else {
			highlightElement(registerLogoElement, "yellow");//highlight yellow if failed
			Assert.fail("Register page is not displayed.");
		}
		
	}
		
	public void enter_into_the_search_box(String x) {
		
		wait.until(ExpectedConditions.visibilityOf(homepageLocatorcrossBrowser1.searchBar)).sendKeys(x);
	}
	
	public void press_enter_key_in_the_search_box() {
		
		homepageLocatorcrossBrowser1.searchBar.sendKeys(Keys.ENTER);
				
	}
	
	public void verify_user_should_see_search_results_related_to(String x) {
		
		WebElement resultsElement = homepageLocatorcrossBrowser1.searchResults;
		Assert.assertTrue( resultsElement.isDisplayed());
		
	}

}



