package seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImpWaitForTitleCase {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// It not applied for title or Url , it not applicable 
		// for title hence mismatch title we can get
		System.out.println(driver.getTitle());
		
		WebElement emailId = driver.findElement(By.id("username")); // 5 sec
		emailId.sendKeys("abbsb");
		System.out.println(driver.getTitle()); // this is solution due to webelement
		
		
		
		
	}

}
