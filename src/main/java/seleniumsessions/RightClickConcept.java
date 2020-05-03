package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));
		List<WebElement> optionsList=driver.findElements(By.xpath("//ul/li[contains(@class,'context-menu-icon')]/span"));
		
		doRightClick(driver,rightClickMe,optionsList,"Copy");
		List<String> rightClickOptionsList=getRightClickOptions(driver,rightClickMe,optionsList);
		System.out.println("total right click options : "+ rightClickOptionsList.size());
		System.out.println(rightClickOptionsList);

		
	}
	// here right click on specific element out of many elements
	public static void doRightClick( WebDriver driver, WebElement rightClickElement,List<WebElement> optionsList,String value) {

		Actions action = new Actions(driver);
		action.contextClick(rightClickElement).build().perform();
		
		
		System.out.println("total right click options "+ optionsList.size());
		for (int i = 0; i < optionsList.size(); i++) {
			String text=optionsList.get(i).getText();
			
			System.out.println(i + "---->-"+ text );
			if (text.equals(value)) {
				optionsList.get(i).click();
				break;
				
			}
			
				}
		
	}
	// list of all the right click elements
	public static List<String> getRightClickOptions( WebDriver driver, WebElement rightClickElement,List<WebElement> optionsList) {
        List<String> ar= new ArrayList<String>();
		Actions action = new Actions(driver);
		action.contextClick(rightClickElement).build().perform();
		
		
		System.out.println("total right click options "+ optionsList.size());
		for (int i = 0; i < optionsList.size(); i++) {
			String text=optionsList.get(i).getText();
			
		//	System.out.println(i + "---->-"+ text );
			ar.add(text);
			
			}
		return ar;
			
				}
		
	}


