package pageLocatorcrossBrowser1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilitycrossBrowser1.BaseClasscrossBrowser1;



public class HomepageLocatorcrossBrowser1 extends BaseClasscrossBrowser1 {
	
	
	
	public HomepageLocatorcrossBrowser1() {
		
		PageFactory.initElements(driver,this);	
	}

	@FindBy (xpath="//img[@alt='ALWAYSFASHION']")
	public WebElement homePageLogo;
	
	@FindBy (xpath="(//a[@class='ico-user'])[1]")
	public WebElement userIcon;
	
	@FindBy (xpath="(//li[@class='ico-register'])[1]")
	public WebElement registerLink;
	
	@FindBy(xpath="(//h1[normalize-space()='Register'])[1]")
	public WebElement registerLogo;
	
	
	
}



