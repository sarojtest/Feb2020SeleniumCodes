package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser="firefox";
		WebDriver driver=null;
		
		
		if (browser.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			}
		else if (browser.equals("firefox")) {
		   // System.setProperty("webdriver.gecko.driver", "D:\\software\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			
		}
		else if (browser.equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver= new InternetExplorerDriver();
		}
		else if (browser.equals("safari")) {
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver= new SafariDriver();
		}
		else {
			System.out.println("browser is not found : " +  browser);
		}
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
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
