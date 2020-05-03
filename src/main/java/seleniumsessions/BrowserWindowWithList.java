package seleniumsessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowWithList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();   //Creates a new ChromeDriver using the defaultserver configuration.
			driver.manage().window().maximize();
			//driver.manage().window().fullscreen();
			driver.manage().deleteAllCookies(); //Delete all the cookies for the current domain.

			driver.get("http://www.popuptest.com/goodpopups.html");
			driver.findElement(By.linkText("Good PopUp #3")).click();
			
			Set<String> handles=driver.getWindowHandles();
			// applying ArrayList
			List<String> handlesList=new ArrayList<String>(handles);
			String parentWindowId=handlesList.get(0);
			System.out.println(parentWindowId);
			String childWindowId=handlesList.get(1);
			System.out.println(childWindowId);
			
			
			

	}

}
