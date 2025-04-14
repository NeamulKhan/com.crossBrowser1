package pageActioncrossBrowser1;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

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
		
	public void user_agrees_to_the_terms_and_conditions_for_registration3() {
		
		wait.until(ExpectedConditions.visibilityOf(register3pageLocatorcrossBrowser1.acceptPrivacy)).click();
	}
		
	public void user_clicks_on_the_register3_button() {
		
	//	wait.until(ExpectedConditions.visibilityOf(register3pageLocatorcrossBrowser1.registerButton)).click();
		
		register3pageLocatorcrossBrowser1.registerButton.click();
		
	}
	
	public void verify_user_should_be_successfully_registered3() {
		/*
		try {
			WebElement welcomeMsgElement = register3pageLocatorcrossBrowser1.welcomeMsg;
			WebElement existMsgElement = register3pageLocatorcrossBrowser1.existMsg;
			
			if (welcomeMsgElement.isDisplayed()) {
			
		//	if (register3pageLocatorcrossBrowser1.welcomeMsg.isDisplayed()) {
				
				 System.out.println("✅ User successfully registered!");
				 highlightElement( welcomeMsgElement, "green"); //Highlight green if passed
			     Assert.assertTrue( welcomeMsgElement.isDisplayed(),"User registration failed!");
			       
			    } //else if (existMsgElement.isDisplayed()){
			else {	
			    	System.out.println("⚠️ User already exists!");
			    	highlightElement(existMsgElement, "yellow");//highlight yellow if failed
			        Assert.assertTrue(existMsgElement.isDisplayed(),"User already exists message not displayed!");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		 try {
		        WebElement welcomeMsgElement = wait.until(ExpectedConditions.visibilityOf(register3pageLocatorcrossBrowser1.welcomeMsg));

		        if (welcomeMsgElement.isDisplayed()) {
		            System.out.println("✅ User successfully registered!");
		            highlightElement(welcomeMsgElement, "green"); // Highlight green if passed
		            Assert.assertTrue(welcomeMsgElement.isDisplayed(), "User registration failed!");
		        } else { // This 'else' corresponds to the 'if (welcomeMsgElement.isDisplayed())'
		         //   try {
		                WebElement existMsgElement = wait.until(ExpectedConditions.visibilityOf(register3pageLocatorcrossBrowser1.existMsg));

		                if (existMsgElement.isDisplayed()) {
		                    System.out.println("⚠️ User already exists!");
		                    highlightElement(existMsgElement, "yellow");// highlight yellow if failed
		                    Assert.assertTrue(existMsgElement.isDisplayed(), "User already exists message not displayed!");
		                } else {
		                    Assert.fail("Neither welcome message nor existing user message was displayed.");
		                }
		            } 
		 			}catch (Exception e) {
		                Assert.fail("Failed to verify 'already exist' message: " + e.getMessage());
		            }
		        
		//    } catch (Exception e) {
		 //       Assert.fail("Failed to verify successful registration: " + e.getMessage());
		    
	
	}
	}	
	
	
	
	
	

