package pageActioncrossBrowser1;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageLocatorcrossBrowser1.Register3pageLocatorcrossBrowser1;
import utilitycrossBrowser1.BaseClasscrossBrowser1;

	public class Register3pageActioncrossBrowser1 extends BaseClasscrossBrowser1 {
	
	Register3pageLocatorcrossBrowser1 register3pageLocatorcrossBrowser1 = new Register3pageLocatorcrossBrowser1();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	
	public void user_selects_gender_for_registration3() {
		
		register3pageLocatorcrossBrowser1.gender.click();
	}
	
	public void user_enters_and(String x, String y, String z) {
		
		wait.until(ExpectedConditions.visibilityOf(register3pageLocatorcrossBrowser1.userFirstName)).sendKeys(x);
		register3pageLocatorcrossBrowser1.userLastName.sendKeys(y);
		register3pageLocatorcrossBrowser1.userEmail.sendKeys(z);
		
	}
		
	public void selects(String x, String y, String z) 	{
		
		  new Select(register3pageLocatorcrossBrowser1.dateOfBirthDay).selectByVisibleText(x);
		  new Select(register3pageLocatorcrossBrowser1.monthOfBirthDay).selectByVisibleText(y);
		  new Select(register3pageLocatorcrossBrowser1.yearOfBirthDay).selectByVisibleText(z);
		
	}
	
	public void selects_country_enter_and(String x, String y, String z) {
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500);");
		
		register3pageLocatorcrossBrowser1.countryFlagContainer.click();
		wait.until(ExpectedConditions.visibilityOf(register3pageLocatorcrossBrowser1.selectCountry)).click();
		register3pageLocatorcrossBrowser1.enterPhoneNumber.sendKeys(x);
		register3pageLocatorcrossBrowser1.userPassword.sendKeys(y);
		register3pageLocatorcrossBrowser1.enterConfirmPassword.sendKeys(z);
		
	}
		
	
		
	}

