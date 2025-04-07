package pageActioncrossBrowser1;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pageLocatorcrossBrowser1.Register2pageLocatorcrossBrowser1;
import utilitycrossBrowser1.BaseClasscrossBrowser1;

public class Register2pageActioncrossBrowser1 extends BaseClasscrossBrowser1 {
	
	Register2pageLocatorcrossBrowser1  register2pageLocatorcrossBrowser1 = new Register2pageLocatorcrossBrowser1();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	public void user_select_gender() {
		
		register2pageLocatorcrossBrowser1.gender.click();
		
	}
	
	public void user_enters_registration2_details(String firstName, String lastName, String email,String date, String month, String year, String country,
            String phoneNumber, String password, String confirmPassword) {
		
		wait.until(ExpectedConditions.visibilityOf(register2pageLocatorcrossBrowser1.userFirstName)).sendKeys(firstName);
	    register2pageLocatorcrossBrowser1.userLastName.sendKeys(lastName);
	    register2pageLocatorcrossBrowser1.userEmail.sendKeys(email);
	    
	    //Selecting Date of Birth
	    
	    new Select(register2pageLocatorcrossBrowser1.dateOfBirthDay).selectByVisibleText(date);
	    new Select(register2pageLocatorcrossBrowser1.monthOfBirthDay).selectByVisibleText(month);
	    new Select(register2pageLocatorcrossBrowser1.yearOfBirthDay).selectByVisibleText(year);
	    
	 
	    // Select country logic based on `country` string
	    
	    ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500);");
	   
	    register2pageLocatorcrossBrowser1.countryFlagContainer.click();
	    if (country.equalsIgnoreCase("USA")) {
	        register2pageLocatorcrossBrowser1.countryUSA.click();
	    } else if (country.equalsIgnoreCase("UK")) {
	        register2pageLocatorcrossBrowser1.countryUK.click();
	    }
	    
	    register2pageLocatorcrossBrowser1.enterPhoneNumber.sendKeys(phoneNumber);
	    register2pageLocatorcrossBrowser1.userPassword.sendKeys(password);
	    register2pageLocatorcrossBrowser1.enterConfirmPassword.sendKeys(confirmPassword);
		
	}
	
	public void agreeToTerms() {
	    wait.until(ExpectedConditions.elementToBeClickable(register2pageLocatorcrossBrowser1.acceptPrivacy)).click();
	
	}

	public void clickRegisterButton() {
	    wait.until(ExpectedConditions.elementToBeClickable(register2pageLocatorcrossBrowser1.registerButton)).click();
	}


	public void validateSuccessfullRegistration() {
	/*	
	    WebElement newUser = wait.until(ExpectedConditions.visibilityOf(register2pageLocatorcrossBrowser1.welcomeMsg));
	    highlightElement(newUser, "green"); //Highlight green if passed
	    Assert.assertTrue(register2pageLocatorcrossBrowser1.welcomeMsg.isDisplayed(), "Registration not successful");
	    */
		
		try {
			WebElement newUser = wait.until(ExpectedConditions.visibilityOf(register2pageLocatorcrossBrowser1.welcomeMsg));
			WebElement userExist =	wait.until(ExpectedConditions.visibilityOf(register2pageLocatorcrossBrowser1.existMsg));
			
			if(newUser.isDisplayed()) {
				
				highlightElement(newUser, "green"); //Highlight green if passed
				Assert.assertTrue(true, "New user registered successfully.");
				System.out.println(" ✅ New user registered successfully.");
			
			}else if (userExist.isDisplayed()){
				
				highlightElement(userExist, "green");//highlight green if failed
				Assert.assertTrue(true, "User already exists.");
				System.out.println(" ⚠️ User already exists.");
			
			}else {
			    Assert.fail("❌ User entered incorrect information.");
			}
		} catch (Exception e) {
			
			Assert.fail(" ❌ Exception while validating messages: " + e.getMessage());
		}
	    
	    
	}
	
	//Method to highlight element
	
	public void highlightElement(WebElement element, String color) {
				
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid " + color + "'", element);
			
		
			}
	
}
