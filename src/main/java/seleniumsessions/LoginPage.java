package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	// By locators ----PageObjects
	static By emailId= By.xpath("//input[@id='username']");
	static By password=By.id("password");
	static By loginButton=By.id("loginBtn");
	static By signUpLink=By.linkText("Sign up");
	static By homePageHeader=By.xpath("//h1[@class='private-page__title']");
	
	public static void main(String[] args) throws InterruptedException {
		// Customise Functions on CustomDriverAction
		
		BrowserActions br=new BrowserActions();
		WebDriver driver=br.launchBrowser("chrome");
		br.launchUrl("https://app.hubspot.com/login/");
		Thread.sleep(5000);
		//System.out.println(br.doGetTitle());
		ElementUtil element=new ElementUtil(driver);
		element.getElement(emailId);
		// Or
		
		// WebElement element1 = driver.findElement(By.id("username"));
	    // element.getElement(emailId).sendKeys("naveenanimation20@gmail.com");
	   // element.getElement(password).sendKeys("Test@12345");
	  //element.getElement(loginButton).click();
		
		element.doSendKeys(emailId, "saroj2310@gmail.com");
		element.doSendKeys(password, "Test@123.");
		element.doClick(loginButton);
		
		Thread.sleep(5000);
		
		String header = element.doGetText(homePageHeader);
		System.out.println("HomePage Header is " + header);
		if (header.equalsIgnoreCase("sales Dashboard")) {
			System.out.println("user login successfully");
			
		}
		else {
			System.out.println("invalod credentials");
		}
		
		

	}

}
