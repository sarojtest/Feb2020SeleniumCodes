package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {

	public static void main(String[] args) {
		// headless : no browser , not visible
		//testing happening behind scene
		//It is faster
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless");
		
		
		WebDriver driver=new ChromeDriver(co);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
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
		//driver.quit();  // Quits this driver, closing every associated window

		

	}

}
