package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
	
	WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver=driver;
		
	}
	//getting (raw) locators
	
	public WebElement getElement(By locator) {
		WebElement element=driver.findElement(locator);
		return element;
		
		
	}
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
		
	}
	// Using Actions SendKeys
	public void doActionsSendKeys(By locator, String values) {
		Actions action = new Actions(driver);
		WebElement element= getElement(locator);
		action.sendKeys(element, values).perform();
		
		
	}
	
	
	public void doClick(By locator) {
		getElement(locator).click();
		
	}
	
	// Using Actions doClick
	public void doActionsClick(By locator) {
		Actions action = new Actions(driver);
		WebElement element=getElement(locator);
		action.click(element).perform();
		
	}
	
	
	
	public String doGetText(By locator) {
		return getElement(locator).getText();
		
	}
	/**
	 * 
	 * @param locator
	 * @return
	 */
	
	public  void getDropDownValues(By locator) {
		Select select=new Select(getElement(locator));
		List<WebElement> optionsList=select.getOptions();
		System.out.println(optionsList.size());
		for (int i = 0; i < optionsList.size(); i++) {
			System.out.println(optionsList.get(i).getText());
			
		}
		
		
	}
	
	public  void selectDropDown(By locator,String value) {
		Select select1=new Select(getElement(locator));
		select1.selectByVisibleText(value);
		
		
	}
	public  void selectDropDown(By locator,int index) {
		Select select1=new Select(getElement(locator));
		select1.selectByIndex(index);
		
		
	}
	public  void selectDropDownValue(By loactor, String value) {
	     Select select=new Select(getElement(loactor));
			
			List<WebElement> valuesList=select.getOptions();
			System.out.println(valuesList.size());
			for (int i = 0; i < valuesList.size(); i++) {
				if (valuesList.get(i).getText().equals(value)) {
					valuesList.get(i).click();
					break;
				}
			}
			
		}
	/**
	 * this method is used to select the value from the drop down - without
	 * using Select class in Selenium
	 * 
	 * @param locator
	 * @param locatorValue
	 * @param value
	 */
	
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
	
	// wait custom methods : wait utils:
	
	public void visibilityOfAllElements(List<WebElement> elements ,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	}
	
	public WebElement waitForElementToBePresent(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return getElement(locator);
	
	}
	public WebElement waitForElementToBeClickable(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		return getElement(locator);
	
	}
	public WebElement waitForElementToBeVisible(By locator, int timeout) {
		WebElement element= getElement(locator);
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	
	}
	public WebElement waitForElementVisibilityLocated(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return getElement(locator);
	}
	public String waitForUrl(String url, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.urlContains(url));
		return driver.getCurrentUrl();
	}
	public boolean waitForAlertToBePresent( int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.alertIsPresent());
		return true;
	}
	public void clickWhenReady(By locator, int timeout) {
		WebDriverWait wait= new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		getElement(locator).click();
		
	}
	
	public String waitForTitleToBePresent(String title, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	
	}

	
	

}
