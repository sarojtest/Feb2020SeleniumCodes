package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverSessionConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();  
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.quit(); // Quits this driver, closing every associated window
		// in quit() .....sessionID will be null
		
		//driver.close(); // Close the current window, quitting the browser if it's the last window currently open
        // in close()  sessionID will be invalid / expired .
	}

}
