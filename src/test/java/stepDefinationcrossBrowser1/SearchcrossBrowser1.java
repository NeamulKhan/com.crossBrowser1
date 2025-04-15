package stepDefinationcrossBrowser1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActioncrossBrowser1.HomepageActioncrossBrowser1;
import utilitycrossBrowser1.BaseClasscrossBrowser1;

public class SearchcrossBrowser1 extends BaseClasscrossBrowser1 {
	
	HomepageActioncrossBrowser1 homepageActioncrossBrowser1 = new HomepageActioncrossBrowser1();
	
	@Given("I am on the Always Fashion homepage")
	public void i_am_on_the_always_fashion_homepage() {
	   
		driver.get("https://www.alwaysfashion.com/en/");
	}

	@When("I enter {string} into the search box")
	public void i_enter_into_the_search_box(String string) {
	   
		homepageActioncrossBrowser1.enter_into_the_search_box(crossBrowser1_prop.getProperty("search.item"));
	}

	@When("I click the search button")
	public void i_click_the_search_button() {
	   
		homepageActioncrossBrowser1.press_enter_key_in_the_search_box();
		
	}

	@Then("I should see search results related to {string}")
	public void i_should_see_search_results_related_to(String string) {
	   
		homepageActioncrossBrowser1.verify_user_should_see_search_results_related_to(crossBrowser1_prop.getProperty("search.item"));
	}




}
