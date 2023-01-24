package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class impicit_Synchronisation_Actitime {
	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			
			WebDriver  driver=new 	ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demo.actitime.com/login.do");
		
			driver.findElement(By.id("username")).sendKeys("admin"); 
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("keepLoggedInCheckBox")).click();
			//Thread.sleep(2000);
	  		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	  		//driver.findElement(By.xpath("//div[text()='Login ']")).sendKeys(Keys.ENTER);
	  		driver.findElement(By.id("logoutLink")).click();
	  	
	}

}
