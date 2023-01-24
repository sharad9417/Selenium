package Basic;
/*
 *(//button[@class="close"]
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver  driver=new 	ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		/*
		 * WebElement ele=driver.findElement(By.id("username"));
		ele.sendKeys("sharad123");
		
		ele=driver.findElement(By.name("pwd"));
		ele.sendKeys("pune");*/
		
				//NOTE:- when we do single operation on targeted element that time we use below line or statement
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.partialLinkText("actiTIME")).click();
		
		//driver.quit();
		//Tagname==> driver.findElement(By.tagname("a")).click();
	}
	

}
