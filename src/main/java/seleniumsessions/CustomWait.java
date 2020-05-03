package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Return;

public class CustomWait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		By emailId=By.id("username");
		By password=By.id("password");
		By login=By.id("loginBtn");
		
		getElementWithWait(driver,emailId, 6).sendKeys("naveen@gmail.com");
		driver.findElement(password).sendKeys("test@123");
		driver.findElement(login).click();

	}
	// Custom Wait ...Interview Question Imp
	public static WebElement getElementWithWait(WebDriver driver, By loactor, int timeout)  {
		WebElement element = null;
		for (int i = 0; i < timeout; i++) {
			try {
				element = driver.findElement(loactor);
				break;
				
			} catch (Exception e) {
		System.out.println("waiting for element to be present on the page...> " + i + "secs");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					
				}
			}
			
			
		}
		return element;
	
	}
	public static boolean isElementDisplayed(WebDriver driver, By loactor, int timeout)  {
		WebElement element = null;
		boolean flag = false;
		for (int i = 0; i < timeout; i++) {
			try {
				element = driver.findElement(loactor);
				flag = element.isDisplayed();
				break;
				
			} catch (Exception e) {
		System.out.println("waiting for element to be present on the page...> " + i + "secs");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					
				}
			}
			
			
		}
		return flag;
	}

}
