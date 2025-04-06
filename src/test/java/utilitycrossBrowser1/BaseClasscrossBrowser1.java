package utilitycrossBrowser1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClasscrossBrowser1 {

	public static Properties crossBrowser1_prop;
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	
	//No need input stream if we fetch data from data table and no properties file presence 
	public  BaseClasscrossBrowser1 () {
				
	try {
		FileInputStream file = new FileInputStream ("src/test/resource/crossBrowser1.config/crossBrowser1.properties");
		
		crossBrowser1_prop = new Properties();
		crossBrowser1_prop.load(file);
		
	} catch (FileNotFoundException e) {
	    System.err.println("Properties file not found: " + e.getMessage());
	}
	  catch (IOException e) {
	    System.err.println("Error loading properties file: " + e.getMessage());
	}
	}
	
	public  static void crossBrowser1_initializeDriver() {
		
	//	String browser = crossBrowser1_prop.getProperty("Browser");
		
		String browserName = System.getProperty("browser", crossBrowser1_prop.getProperty("Browser"));
		
		switch (browserName.toLowerCase()) {
		
	    case "chrome":
	        System.out.println("Initializing Chrome browser...");
	        driver = new ChromeDriver();
	        break;
	        
	    case "edge":
	        System.out.println("Initializing Edge browser...");
	        driver = new EdgeDriver();
	        break;
	        
	    default:
	        throw new IllegalStateException("Unsupported browser: " + browserName);
	}
		
			
		wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Initialize WebDriverWait here
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
			
		}

	public static void crossBrowser1_launchURL() {
	
		driver.get(crossBrowser1_prop.getProperty("base.url"));
}

	/*
	 public static void closeDriver() {
	        if (driver != null) {
	            driver.quit();
	        }
	
}*/

}
	
	
