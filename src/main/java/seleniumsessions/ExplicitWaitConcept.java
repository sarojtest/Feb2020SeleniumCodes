package seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
//		WebDriverWait wait = new WebDriverWait(driver, 15);
//		wait.until(ExpectedConditions.titleContains("Login"));
////		wait.until(ExpectedConditions.titleIs("HubSpot Login"));
//		
//		System.out.println(driver.getTitle());
//		
		// tried for 15 seconds with 500ms interval 
		// here we achieve synchronisation 
		
		getElementWithExpWait( driver, 10,By.id("username") ).sendKeys("test");
	
//		WebDriverWait wait = new WebDriverWait(driver, 15);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
		
//		WebElement emailId = driver.findElement(By.id("username"));
	//	emailId.sendKeys("test");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("test123");
		
		WebElement loginButton = driver.findElement(By.id("loginBtn"));
		loginButton.click();
	
	}
	public static WebElement getElementWithExpWait(WebDriver driver, int timeout, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return  wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		
		
	}

}
