package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag$Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		// solution 1: with dragAndDropMethod
		action.dragAndDrop(source, target).build().perform();

		//solution 2 : without inbuilt method
		action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).
	    moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).
      release().build().perform();

	}

}
