package seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScoreCard {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/8531/scorecard/65577/england-vs-sri-lanka-8th-match-carlton-&-united-series-1998-99");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		getWicketKeeper( driver, "NV Knight");
		getWicketKeeper( driver,  "N Hussain");
		
		System.out.println(getScoreCard( driver,  "N Hussain"));
		System.out.println(getScoreCard( driver,  "NH Fairbrother"));
		

	}	
	 public static String getWicketKeeper(WebDriver driver, String playername) {
		 System.out.println("wicket taker for player"+ playername);
		 String text =driver.findElement(By.xpath("//a[text()='"+ playername +"']//parent::div//following-sibling::div//a[text()]")).getText();
			System.out.println(text);
			return text;
			
		
	}
	 public static ArrayList<String> getScoreCard(WebDriver driver, String playername) {
		 System.out.println("scorecard for player" + playername);
		 ArrayList<String> scoreCardList=new ArrayList<String>();
		 List<WebElement> scoreList=driver.findElements(By.xpath("//a[text()='"+playername +"']//parent::div//following-sibling::div[@class='cell runs']"));
		// System.out.println("scoreList size is  :: "+ scoreList.size());
		 for (int i = 0; i < scoreList.size(); i++) {
			 String text=scoreList.get(i).getText();
			 scoreCardList.add(text);
		}
		 return scoreCardList;
	 }

		
		
		

	

}
