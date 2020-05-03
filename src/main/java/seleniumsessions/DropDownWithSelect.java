package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithSelect {

	public static void main(String[] args) {
		//select htmltag based dropdowns
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		
		
		Select select=new Select(day);
		select.selectByVisibleText("15");
		
		List<WebElement> dayList=select.getOptions();
		System.out.println("total values of days in dropdown : " + dayList.size());
		for (int i = 0; i < dayList.size(); i++) {
			System.out.println(dayList.get(i).getText());
			
		}
		Select select1=new Select(day);
		List<WebElement> monthList=select1.getOptions();
		System.out.println(monthList.size());
		for (int i = 0; i < monthList.size(); i++) {
			System.out.println(monthList.get(i).getText());
			
		}
		
		System.out.println(select.isMultiple());
		
		
		select.deselectAll();
//		select.selectByIndex(20);
//		select.deselectByValue("9");
//		
//		Select select1=new Select(month);
//		select1.selectByVisibleText("Jun");
//		
//		Select select2=new Select(year);
//		select2.selectByVisibleText("1990");
		
		DropDownWithSelect.selectDropDown(day, "10");
		selectDropDown(month, "Jan");
		selectDropDown(year, "1990");
		selectDropDown(month, 5);
		
		getDropDownValues(day);
		getDropDownValues(month);
		getDropDownValues(year);
		
		
//		
	
	}
	public static void getDropDownValues(WebElement element) {
		Select select=new Select(element);
		List<WebElement> optionsList=select.getOptions();
		System.out.println(optionsList.size());
		for (int i = 0; i < optionsList.size(); i++) {
			System.out.println(optionsList.get(i).getText());
			
		}
		
		
	}
	
	public static void selectDropDown(WebElement element,String value) {
		Select select1=new Select(element);
		select1.selectByVisibleText(value);
		
		
	}
	public static void selectDropDown(WebElement element,int index) {
		Select select1=new Select(element);
		select1.selectByIndex(index);
		
		
	}

}
