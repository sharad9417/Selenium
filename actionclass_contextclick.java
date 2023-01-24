package Basic;
/*
 * 
 */
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass_contextclick {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver  driver=new 	ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		WebElement element = driver.findElement(By.name("q"));
		Actions action=new Actions (driver);
		//action.contextClick();  //it will rigth-click current position of mouse pointer on webpage
		action.contextClick(element);
		action.perform();
	}

}
