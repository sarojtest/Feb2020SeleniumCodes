package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandalingWithoutSelect {
	//Without Select class ,handaling dropdown 
	
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		
		String dob="10-Nov-1990";
		
//		selectDropDownValue(day, dob.split("-")[1]);
//		selectDropDownValue(day, dob.split("-")[2]);
	//	selectDropDownValue(day, dob.split("-")[0]);
		
		String dayOptionsCSS = "select#day option";    //using CSS
		String monthOptionsCSS="select#month option";
		String yearOptionsCSS="select#year option";

		
		String dayOptionsXpath="//select[@id='day']/option";
		String monthOptionsXpath="//select[@id='month']/option";
		String yearOptionsXpath="//select[@id='year']/option";
		
		//Method Calling with Xpath:
		doSelectValueFromDropDownWithoutSelect(driver, dayOptionsXpath, dob.split("-")[0]);
		doSelectValueFromDropDownWithoutSelect(driver, monthOptionsXpath, dob.split("-")[1]);
        doSelectValueFromDropDownWithoutSelect(driver, yearOptionsXpath, dob.split("-")[2]);
        
        //Method calling with Css:
        doSelectValueFromDropDownWithOutSelect(driver, "css", dayOptionsCSS, dob.split("-")[0]);
		doSelectValueFromDropDownWithOutSelect(driver, "css", monthOptionsCSS, dob.split("-")[1]);
		doSelectValueFromDropDownWithOutSelect(driver, "css", yearOptionsCSS, dob.split("-")[2]);

		
		
	
		}
	public static void doSelectValueFromDropDownWithOutSelect(WebDriver driver, String locator, String locatorValue,
			String value) {

		List<WebElement> valuesList = null;

		if (locator.equals("xpath")) {
			valuesList = driver.findElements(By.xpath(locatorValue));
		}

		else if (locator.equals("css")) {
			valuesList = driver.findElements(By.cssSelector(locatorValue));
		}

		System.out.println(valuesList.size());

		for (int i = 0; i < valuesList.size(); i++) {
			if (valuesList.get(i).getText().equals(value)) {
				valuesList.get(i).click();
				break;
			}
			}
		}
	
	public static void doSelectValueFromDropDownWithoutSelect(WebDriver driver,String xpath,String value) {
		List<WebElement> valuesList=driver.findElements(By.xpath(xpath));
		System.out.println(valuesList.size());
		for (int i = 0; i < valuesList.size(); i++) {
			if (valuesList.get(i).getText().equals(value)) {
				valuesList.get(i).click();
				break;
			}
		
		
		}}
	public static void doSelectValueFromDropDownWithoutSelectCSS(WebDriver driver,String locator,String value) {
		
		List<WebElement> valuesList=driver.findElements(By.cssSelector(locator));
		System.out.println(valuesList.size());
		for (int i = 0; i < valuesList.size(); i++) {
			if (valuesList.get(i).getText().equals(value)) {
				valuesList.get(i).click();
				break;
			}
		
		
		}}
	
		

	}
	
	
