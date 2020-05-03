package seleniumsessions;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		// To Get links
		List<WebElement> linkList=driver.findElements(By.tagName("a"));
		System.out.println(linkList.size());
		
		System.out.println("total no of links : "+ linkList.size());
		for (int i = 0; i < linkList.size(); i++) {
			String text=linkList.get(i).getText();
			System.out.println(text);
			
			if (!text.isEmpty()) {
				System.out.println(i + "--->"+ text);
				linkList.get(i).getAttribute("href");
				
			}
			
		}
		
		

	}

}
