package seleniumsessions;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {


	public static void main(String[] args) {

		// Explicit wait:
		// WebDriverWait
		// FluentWait : Timeout ,Polling period,Ignoring Exception ,until
		
		// When to use FluentWait:
		// For handling AJAX applications ..like Cricinfo , corona meter..updates changes
		// freqyently

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://classic.crmpro.com/");

		final By username = By.name("username");
		By password = By.name("password");
		By login = By.xpath("//input[@value='Login']");
		
		waitForElementWithFluentWait( driver, username).sendKeys("batchautomation");
		driver.findElement(password).sendKeys("Test@12345");
		driver.findElement(login).click();
	}
		// 1st approach : Fluent Wait with wait // Both are same
	   // applicable for all title and url etc..
		public static WebElement waitForElementWithWait(WebDriver driver, final By locator) {
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(15))
					.pollingEvery(Duration.ofSeconds(3))
					.ignoring(NoSuchElementException.class);
			return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

		}
		// 2nd approach : Fluent wait by using Anonymous Class / Interface (For Interview Point imp)

	public static WebElement waitForElementWithFluentWait(WebDriver driver, final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);

          // Ananymous Class creation or Function acts as an Interface here
		         WebElement element= wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});
		         return element;

	}

}
