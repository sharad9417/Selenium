package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptenable {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			
			WebDriver  driver=new 	ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			//WebElement element = driver.findElement(By.id("loginButton"));
			WebElement element1=driver.findElement(By.id("username"));
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			//jse.executeScript("arguments[0].click()",element );
			jse.executeScript("arguments[0]. value='pune'", element1);
	}

}
