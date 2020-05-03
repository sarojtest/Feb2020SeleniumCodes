package seleniumsessions;

import java.util.List;

import javax.xml.soap.Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.jqueryscript.net/Drop-Down-Combo-Tree/");
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("justAnInputBox")).click();
		selectChoiceValues(driver,"choice 2");
		selectChoiceValues(driver,"choice 2 3");
		selectChoiceValues(driver,"choice 6 2 3" , "choice 7");
		
		// 1. single value selection
				// selectChoiceValues(driver, "choice 2");

				// 2. multiple value selections:
				//selectChoiceValues(driver, "choice 2", "choice 7", "choice 6 2 3");

				// 3. select ALL the values:
				 selectChoiceValues(driver, "ALL");


		
		}
	public static void selectChoiceValues(WebDriver driver ,String...value ) {
		List<WebElement> choiceList=driver.findElements(By.cssSelector("span.comboTreeItemTitle "));
		if (!value[0].equalsIgnoreCase("ALL")) {
		for (int i = 0; i < choiceList.size(); i++) {
			String text=choiceList.get(i).getText();
			System.out.println(text);
			for (int k = 0; k < value.length; k++) {
				if (text.equals(value[k])) {
					choiceList.get(i).click();
					break;
					
				}
				
			}
			
			
		}
		}
		else 
		try {
			{
				for (int all = 0; all < choiceList.size(); all++) {
					choiceList.get(all).click();
					
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
		



}
