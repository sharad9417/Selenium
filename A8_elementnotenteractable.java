package Basic;
/*
 * ElementNotInteractableException
 */
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A8_elementnotenteractable {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			
			WebDriver  driver=new 	ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("keepLoggedInCheckBox")).click();
	  		//driver.findElement(By.xpath("//div[text()='Login ']")).click();
	  		driver.findElement(By.xpath("//div[text()='Login ']")).sendKeys(Keys.ENTER);
	}

}
