package stepDefinationcrossBrowser1;

import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActioncrossBrowser1.HomepageActioncrossBrowser1;
import pageActioncrossBrowser1.RegisterpageActioncrossBrowser1;
import utilitycrossBrowser1.BaseClasscrossBrowser1;

public class RegistercrossBrowser1 extends BaseClasscrossBrowser1{
	
	HomepageActioncrossBrowser1  homepageActioncrossBrower1 = new HomepageActioncrossBrowser1();
	RegisterpageActioncrossBrowser1 registerpageActioncrossBrowser1 = new RegisterpageActioncrossBrowser1();
	
	@Given("User launches the Always Fashion website")
	public void user_launches_the_always_fashion_website() {
	   
		crossBrowser1_launchURL();
	}

	@Then("verify website homepage load successfully")
	public void verify_website_homepage_load_successfully() {
	   
		 homepageActioncrossBrower1.verify_website_homepage_load_successfully();
	}

	@When("User clicks on the user icon and clicks the Registration link")
	public void user_clicks_on_the_user_icon_and_clicks_the_registration_link() {
	
		 homepageActioncrossBrower1.user_clicks_on_the_user_icon_and_the_Registration_link();
	}

	@Then("User should be navigated to the Registration page")
	public void user_should_be_navigated_to_the_registration_page() {
	   
		 homepageActioncrossBrower1.user_should_be_navigated_to_the_registration_page();
	}

	// (Data table with header like 'Feild' , 'Value' columns)
	
	@Given("User is on the registration page")
	public void user_is_on_the_registration_page() {
	    
		 driver.get(crossBrowser1_prop.getProperty("registration.url"));
	//	 homepageActioncrossBrower1.user_should_be_navigated_to_the_registration_page();
		 Assert.assertTrue(driver.getCurrentUrl().contains("/register")); // Verify URL
	}

	@When("User select gender")
	public void user_select_gender() {
	  
		registerpageActioncrossBrowser1.user_select_gender();
	}

	@When("User enters the following details:")
	public void user_enters_the_following_details(DataTable dataTable) {
	   
		registerpageActioncrossBrowser1.user_enter_the_following_details(dataTable);
	}

	@When("User agrees to the terms and conditions")
	public void user_agrees_to_the_terms_and_conditions() {
	   
		registerpageActioncrossBrowser1.user_check_to_the_terms_and_conditions();
	}

	@When("User clicks on the Register button")
	public void user_clicks_on_the_register_button() {
	   
		registerpageActioncrossBrowser1.user_clicks_on_the_register_button();
	}

	@Then("User should be successfully registered")
	public void user_should_be_successfully_registered() {
	    
		registerpageActioncrossBrowser1.verify_user_should_be_successfully_registered();
	}

	@Then("User should see a successful registration message")
	public void user_should_see_a_successful_registration_message() {
	   
		
	}



	
	
	
}
