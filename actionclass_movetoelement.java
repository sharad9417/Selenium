package Basic;
/*
 * move the  mouse pointer from current position to targeted webelement
 */

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass_movetoelement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		   driver.get("https://www.flipkart.com/");
	        driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();  
	       // WebElement element = driver.findElement(By.xpath("//div[text()='Fashion']"));
	        WebElement element = driver.findElement(By.xpath("//div[text()='Home']"));
	      Actions action=new Actions (driver);
	      action.moveToElement(element);
	      action.perform();
	      
	}

}
