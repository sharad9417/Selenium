package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3Acti_Time_Login_by_Text {
	public static void main(String[] args) throws InterruptedException {
		
       System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver  driver=new 	ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		
		/* WebElement ele=driver.findElement(By.id("username"));
		 Thread.sleep(2000);
		ele.sendKeys("admin");
		
		ele=driver.findElement(By.name("pwd"));
		Thread.sleep(2000);
		ele.sendKeys("manager");*/
		driver.findElement(By.id("username")).sendKeys(null); //illegalargumentException
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
  		//driver.findElement(By.xpath("//div[text()='Login ']")).click();
  		driver.findElement(By.xpath("//div[text()='Login ']")).sendKeys(Keys.ENTER);
  		Thread.sleep(2000);
  		driver.findElement(By.id("container_tasks")).click();
  		driver.findElement(By.id("container_reports")).click();
  		driver.findElement(By.id("container_users")).click();
  		Thread.sleep(2000);
  		driver.findElement(By.id("logoutLink")).click();
	}

}
