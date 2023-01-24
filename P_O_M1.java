package Basic;
/*
 * stale Elemenet Refresh exception
 * stale means old
 *    Element refresh-->adress of elemenet
 *    to avoid this type of exception we use POM(page object Model)
 */
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_O_M1 {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver  driver=new 	ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		WebElement ele = driver.findElement(By.id("username"));
		ele.sendKeys("pune");
		driver.navigate().refresh();
		ele.sendKeys("admin");
	}

}
