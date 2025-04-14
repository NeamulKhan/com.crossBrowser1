package stepDefinationcrossBrowser1;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActioncrossBrowser1.Register3pageActioncrossBrowser1;
import utilitycrossBrowser1.BaseClasscrossBrowser1;

public class Register3crossBrowser1 extends BaseClasscrossBrowser1 {
	
	Register3pageActioncrossBrowser1 register3pageActioncrossBrowser1 = new Register3pageActioncrossBrowser1();
	
	
	@Given("User is on the registration3 page")
	public void user_is_on_the_registration3_page() {
	    
		driver.get(crossBrowser1_prop.getProperty("registration.url"));
		Assert.assertTrue(driver.getCurrentUrl().contains("/register")); // Verify URL
	}

	@When("User selects gender for registration3")
	public void user_selects_gender_for_registration3() {
	    
		register3pageActioncrossBrowser1.user_selects_gender_for_registration3();
	}

	@When("User enters {string}, {string}, and {string}")
	public void user_enters_and(String string, String string2, String string3) {
	    
		register3pageActioncrossBrowser1.user_enters_and(crossBrowser1_prop.getProperty("first.name"), 
		crossBrowser1_prop.getProperty("last.name"), crossBrowser1_prop.getProperty("email"));
	}
	
	@When("selects {string}, {string}, {string}")
	public void selects(String string, String string2, String string3) {
	   
		register3pageActioncrossBrowser1.selects(crossBrowser1_prop.getProperty("date.of.birth"), 
		crossBrowser1_prop.getProperty("month.of.birth"),crossBrowser1_prop.getProperty("year.of.birth"));
	}
	
	@When("selects country, enter {string}, {string}, and {string}")
	public void selects_country_enter_and(String string, String string2, String string3) {
	   
		register3pageActioncrossBrowser1.selects_country_enter_and(crossBrowser1_prop.getProperty("phone.number"), 
		crossBrowser1_prop.getProperty("password"), crossBrowser1_prop.getProperty("confirm.password"));
		
	}
	

	@When("User agrees to the terms and conditions for registration3")
	public void user_agrees_to_the_terms_and_conditions_for_registration3() {
	   
		register3pageActioncrossBrowser1.user_agrees_to_the_terms_and_conditions_for_registration3();
		
	}

	@When("User clicks on the Register3 button")
	public void user_clicks_on_the_register3_button() {
	   
		register3pageActioncrossBrowser1.user_clicks_on_the_register3_button();
	}

	@Then("verify user should be successfully registered3")
	public void verify_user_should_be_successfully_registered3() {
	   
		register3pageActioncrossBrowser1.verify_user_should_be_successfully_registered3();
	}


}
