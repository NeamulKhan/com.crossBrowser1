package pageLocatorcrossBrowser1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilitycrossBrowser1.BaseClasscrossBrowser1;

public class MensWatchpageLocatorcrossBrowser1 extends BaseClasscrossBrowser1 {
	
	
	public  MensWatchpageLocatorcrossBrowser1 () {
		
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath="(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]")
	public WebElement minimumPrice;	
	
		
	@FindBy(xpath="(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]")
	public WebElement maximumPrice;	
		
	
}
