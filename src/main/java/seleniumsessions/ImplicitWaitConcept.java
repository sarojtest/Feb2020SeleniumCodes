package seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// Implicit wait will be applied for all the WebElements by default
		// It applied on the driver dynamically...for w1,w2,....wn.
		// It is global weight and applied globally.
		
		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		
		WebElement emailId = driver.findElement(By.id("username")); // 5 sec
		WebElement password = driver.findElement(By.id("password"));// 1 sec
		WebElement loginButton = driver.findElement(By.id("loginBtn"));//0 sec
		
		emailId.sendKeys("naveen@gmail.com");
		password.sendKeys("naveen123");
		loginButton.click();
		
		// For Diff page, we can override the same say...for HomePage
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// For search Page // nullify the implicit wait
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		//w1,w2,....wn // 0 secs


	}

}
