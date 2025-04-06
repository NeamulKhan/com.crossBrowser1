package pageActioncrossBrowser1;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import pageLocatorcrossBrowser1.RegisterpageLocatorcrossBrowser1;
import utilitycrossBrowser1.BaseClasscrossBrowser1;

public class RegisterpageActioncrossBrowser1 extends BaseClasscrossBrowser1 {
	
	RegisterpageLocatorcrossBrowser1  registerpageLocatorcrossBrowser1 = new RegisterpageLocatorcrossBrowser1();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	
	public void user_select_gender() {
		
		wait.until(ExpectedConditions.visibilityOf(registerpageLocatorcrossBrowser1.gender)).click();
				
		}
	
	public void user_enter_the_following_details(DataTable dataTable) {
		
	    List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	    
	    for (Map<String, String> row : data) {
	        String fieldName = row.get("Field");
	        String fieldValue = row.get("Value");

	        switch (fieldName) {
	            case "FirstName":
	                wait.until(ExpectedConditions.visibilityOf(registerpageLocatorcrossBrowser1.userFirstName))
	                    .sendKeys(fieldValue);
	                break;
	            case "LastName":
	                wait.until(ExpectedConditions.visibilityOf(registerpageLocatorcrossBrowser1.userLastName))
	                    .sendKeys(fieldValue);
	                break;
	            case "Email":
	                wait.until(ExpectedConditions.visibilityOf(registerpageLocatorcrossBrowser1.userEmail))
	                    .sendKeys(fieldValue);
	                break;
	            case "Date_of_Birth":
	                Select selectDay = new Select(registerpageLocatorcrossBrowser1.dateOfBirthDay);
	                selectDay.selectByVisibleText(fieldValue);
	                break;
	            case "Month_of_Birth":
	                Select selectMonth = new Select(registerpageLocatorcrossBrowser1.monthOfBirthDay);
	                selectMonth.selectByVisibleText(fieldValue);
	                break;
	            case "Year_of_Birth":
	                Select selectYear = new Select(registerpageLocatorcrossBrowser1.yearOfBirthDay);
	                selectYear.selectByVisibleText(fieldValue);
	                break;
	            case "Country":
	            	
	            	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500);");
	            	registerpageLocatorcrossBrowser1.countryFlagContainer.click();
	                wait.until(ExpectedConditions.visibilityOf(registerpageLocatorcrossBrowser1.selectCountry)).click();
	                break;
	            case "PhoneNumber":
	                wait.until(ExpectedConditions.visibilityOf(registerpageLocatorcrossBrowser1.enterPhoneNumber))
	                    .sendKeys(fieldValue);
	                break;
	            case "Password":
	                wait.until(ExpectedConditions.visibilityOf(registerpageLocatorcrossBrowser1.userPassword))
	                    .sendKeys(fieldValue);
	                break;
	            case "Confirm_Password":
	                wait.until(ExpectedConditions.visibilityOf(registerpageLocatorcrossBrowser1.enterConfirmPassword))
	                    .sendKeys(fieldValue);
	                break;
	            default:
	                System.out.println("Unknown field: " + fieldName);
	        }
	    }
	    
	   
	}
	
	public void user_check_to_the_terms_and_conditions() {
		
		wait.until(ExpectedConditions.visibilityOf(registerpageLocatorcrossBrowser1.acceptPrivacy)).click();
	}
	
	public void  user_clicks_on_the_register_button() {
		
		wait.until(ExpectedConditions.visibilityOf(registerpageLocatorcrossBrowser1.registerButton)).click();
		
	}
	
	public void verify_user_should_be_successfully_registered() {
		
		
		try {
			WebElement newUser = wait.until(ExpectedConditions.visibilityOf(registerpageLocatorcrossBrowser1.welcomeMsg));

			if(newUser.isDisplayed()) {
				
				highlightElement(newUser, "green"); //Highlight green if passed
				Assert.assertTrue(true, "New user registered successfully.");
				System.out.println("New user registered successfully.");
				 return; // Exit the method as existing user scenario was handled
				
			}
		}catch (org.openqa.selenium.TimeoutException e) {
            // Welcome message not found, check for existing user message
        }
		
		
		try {
			WebElement userExist =	wait.until(ExpectedConditions.visibilityOf(registerpageLocatorcrossBrowser1.existMsg));
			 if (userExist.isDisplayed()) {
				
				 highlightElement(userExist, "green");//highlight green if failed
				Assert.assertTrue(true, "User already exists.");
				System.out.println("User already exists.");
				
				//  to capture the specific error message displayed for an existing user.
			    String errorMessage = registerpageLocatorcrossBrowser1.existMsg.getText();
			    System.out.println("Existing user error message: " + errorMessage);
			    return; // Exit the method as existing user scenario was handled
			}
		}catch (org.openqa.selenium.TimeoutException e) {
            // Existing user message not found
        }
	}
	
	//Method to highlight element
		
		public void highlightElement(WebElement element, String color) {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.border='3px solid " + color + "'", element);
		
	
		}
	
		
	}
	

