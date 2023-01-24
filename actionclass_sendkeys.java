package Basic;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass_sendkeys {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver  driver=new 	ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		Actions action=new Actions (driver);
		action.sendKeys(Keys.PAGE_DOWN); 
	
	
		action.perform();
	}

}
