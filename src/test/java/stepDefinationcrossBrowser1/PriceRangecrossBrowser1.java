package stepDefinationcrossBrowser1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActioncrossBrowser1.MensWatchpageActioncrossBrowser1;
import utilitycrossBrowser1.BaseClasscrossBrowser1;

public class PriceRangecrossBrowser1 extends BaseClasscrossBrowser1 {
	
	MensWatchpageActioncrossBrowser1 mensWatchpageActioncrossBrowser1 = new MensWatchpageActioncrossBrowser1 ();
	
	@Given("I am on men's watch products page")
	public void i_am_on_men_s_watch_products_page() {
	    
		driver.get(crossBrowser1_prop.getProperty("mens.watch.url"));
	}

	@When("I enter minimum price and maximum price range")
	public void i_enter_minimum_price_and_maximum_price_range() {
  
		mensWatchpageActioncrossBrowser1.user_enter_minimum_price_and_maximum_price_range(crossBrowser1_prop.getProperty("minPrice"), 
		crossBrowser1_prop.getProperty("maxPrice"));
	}

	@Then("I should see products priced between minimum and maximum prices")
	public void i_should_see_products_priced_between_minimum_and_maximum_prices() {
	  
		
	}


}
