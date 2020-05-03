package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		Thread.sleep(5000);
        WebElement contentLink=driver.findElement(By.className("menulink"));
     // if 1 action then .build can be ignored 

        Actions action=new Actions(driver);
        action.moveToElement(contentLink).build().perform();
        
        driver.findElement(By.linkText("courses")).click();
        
	}

}
