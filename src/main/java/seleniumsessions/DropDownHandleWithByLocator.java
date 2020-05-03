package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithByLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		By day = By.id("day");
		By month=By.id("month");
		By year=By.id("year");
		
		getDropDownValues( driver,day);
		getDropDownValues( driver,month);
		getDropDownValues( driver,year);
		
		List<String> daysList = getDropDownValues(driver, day);
		System.out.println("total days: " + daysList.size());
		System.out.println(daysList);

		List<String> monthList = getDropDownValues(driver, month);
		System.out.println("total months: " + monthList.size());
		System.out.println(monthList);

		List<String> yearList = getDropDownValues(driver, year);
		System.out.println("total years: " + yearList.size());
		System.out.println(yearList);
		
	
	}
	public static List<String> getDropDownValues(WebDriver driver,By locator) {
		List<String> ar = new ArrayList<String>();
		
		ElementUtil elementUtil=new ElementUtil(driver);
		WebElement element=elementUtil.getElement(locator);
		Select select=new Select(element);
		List<WebElement> optionsList=select.getOptions();
		System.out.println(optionsList.size());
		for (int i = 0; i < optionsList.size(); i++) {
			//System.out.println(optionsList.get(i).getText());
			ar.add(optionsList.get(i).getText());
			
		}
		return ar;
		
		
	}
	

}
