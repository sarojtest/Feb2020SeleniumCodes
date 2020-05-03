package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserActions {
	WebDriver driver;
	/**
	 * This method is used to launch/initialise the browser, based on given browser name.
	 * @param browser
	 * @return 
	 */


	public WebDriver launchBrowser(String browser) {
		//WebDriver driver=null;
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new ChromeDriver();
			break;
			
		case "safari":
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver=new ChromeDriver();
			break;



		default:
			System.out.println("please pass the correct browse : " + browser);
			break;
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
	}
	public void launchUrl(String url) {
		driver.get(url);
		
		
	}
	public String doGetTitle() {
		driver.getTitle();
		return driver.getTitle();
		
	}
	public void quitBrowser() {
		driver.quit();
		
	}
		
	}
	

