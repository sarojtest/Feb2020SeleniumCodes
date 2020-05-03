package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//get total no of images
		List<WebElement> imageList=driver.findElements(By.tagName("img"));
		System.out.println("toalimages is :  "+ imageList.size() );
		
		for (int i = 0; i < imageList.size(); i++) {
			imageList.get(i).getAttribute("src");
			
		}
		

	}

}
