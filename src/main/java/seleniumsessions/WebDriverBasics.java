package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver.exe");
		// Manual effort to Automation Effort ......Automation
		
		WebDriver driver=new ChromeDriver();   //Creates a new ChromeDriver using the defaultserver configuration.
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies(); //Delete all the cookies for the current domain.

		driver.get("http://www.google.com");//Load a new web page in the current browser window. This is done using an HTTP GET operation
		System.out.println(driver.getTitle()); //The title of the current page, with leading and trailing whitespace,nullif one is not already set
		
		// validation point  .......Automation Testing
		
		if (driver.getTitle().equals("Google")) {
			System.out.println("Correct Title");
			
		}
		else {
			System.out.println("Incorrect Title");
		}
		String url=driver.getCurrentUrl(); // Get a string representing the current URL that the browser is looking at.
		if (url.contains("google")) {
			System.out.println("correct url");
			
		}else {
			System.out.println("incorrect url");
		}
		
		//System.out.println(driver.getPageSource());
		// quit Browser
		driver.quit();  // Quits this driver, closing every associated window

	}

}
