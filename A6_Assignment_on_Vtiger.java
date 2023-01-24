package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A6_Assignment_on_Vtiger {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver  driver=new 	ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		/*driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("sharad");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("7774957058");*/
		
		
		WebElement ele=driver.findElement(By.id("username"));
		ele.clear();
		Thread.sleep(2000);
		ele.sendKeys("Sharadshinde");
		
	 WebElement el=driver.findElement(By.id("password"));
	    el.clear();
	    Thread.sleep(2000);
	    el.sendKeys("7774957058");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	}

}
