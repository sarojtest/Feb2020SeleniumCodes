package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
//		WebElement emailId = driver.findElement(By.id("username"));
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement loginButton = driver.findElement(By.id("loginBtn"));
//		
//		Actions action = new Actions(driver);
//		action.sendKeys(emailId, "naveen@gmail.com").build().perform();
//		action.sendKeys(password, "naveen@123").perform();
//		action.click(loginButton).perform();
		
		ElementUtil elementUtil=new ElementUtil(driver);
		elementUtil.doActionsSendKeys(By.id("username"), "naveen@gmail.com");
		elementUtil.doActionsSendKeys(By.id("password"), "naveen@123");
		elementUtil.doActionsClick(By.id("loginBtn"));
		
		


		

	}

}
