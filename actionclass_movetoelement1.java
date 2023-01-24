package Basic;
/*
 * move the mouse pointer according to x na d y coordinate of targeted webelement
 */
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass_movetoelement1 {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver  driver=new 	ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.actitime.com/");
		WebElement element = driver.findElement(By.linkText("Pricing"));
		Actions action=new Actions (driver);
		Thread.sleep(2000);
	      action.moveToElement(element, -100, 0);
	      action.perform();
	}

}
