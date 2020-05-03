package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUp {

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
		// applying iterator
		Iterator<String> it=handles.iterator();
		String parentWindowId=it.next();
		System.out.println(parentWindowId);
		String childWindowId=it.next();
		System.out.println(childWindowId);
		
		driver.switchTo().window(childWindowId);
		
		System.out.println("child popup is " + driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent window is "+ driver.getTitle());
		
		
		
		
		

	}

}
