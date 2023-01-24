package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A7_Actitime_shortkeys {
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			
			WebDriver  driver=new 	ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			WebElement ele=driver.findElement(By.id("username"));
			Thread.sleep(2000);
			ele.sendKeys("admin");
			
			ele.sendKeys(Keys.CONTROL+"a");
			Thread.sleep(2000);
			ele.sendKeys(Keys.CONTROL+"c");
			driver.findElement(By.name("pwd")).sendKeys(Keys.CONTROL+"v");
	}

}
