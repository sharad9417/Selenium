package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class byusingsendkeysclick {
	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			
			WebDriver  driver=new 	ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("keepLoggedInCheckBox")).click();
			//Thread.sleep(2000);
	  		driver.findElement(By.id("loginButton")).sendKeys(Keys.ENTER);
	  		
	}

}
