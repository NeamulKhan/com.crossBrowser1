package stepDefinationcrossBrowser1;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActioncrossBrowser1.Register2pageActioncrossBrowser1;
import utilitycrossBrowser1.BaseClasscrossBrowser1;

public class Register2crossBrowser1 extends BaseClasscrossBrowser1 {
	
	Register2pageActioncrossBrowser1  register2pageActioncrossBrowser1 = new Register2pageActioncrossBrowser1();
	
	@Given("User is on the registration2 page")
	public void user_is_on_the_registration2_page() {
	   
		driver.get(crossBrowser1_prop.getProperty("registration.url"));
		Assert.assertTrue(driver.getCurrentUrl().contains("/register")); // Verify URL
	}

	@When("User selects gender for registration2")
	public void user_selects_gender_for_registration2() {
	   
		register2pageActioncrossBrowser1.user_select_gender();
	}

	@When("User enters registration2 details: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void user_enters_registration2_details(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10) {
	  
		register2pageActioncrossBrowser1.user_enters_registration2_details(string, string2, string3, string4, string5, string6, string7, string8, string9, string10);
		
	}

	@When("User agrees to the terms and conditions for registration2")
	public void user_agrees_to_the_terms_and_conditions_for_registration2() {
	  
		register2pageActioncrossBrowser1.agreeToTerms();
	}

	@When("User clicks on the Register2 button")
	public void user_clicks_on_the_register2_button() {
	   
		register2pageActioncrossBrowser1.clickRegisterButton();
	}

	@Then("User should be successfully registered2")
	public void user_should_be_successfully_registered2() {
	  
		register2pageActioncrossBrowser1.validateSuccessfullRegistration();
	}

}
