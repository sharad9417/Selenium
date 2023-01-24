package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1Xpath_by_Attribute {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		    driver.findElement(By.xpath("//img[@alt='Grocery']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@alt='Appliances']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@alt='Travel']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@alt='2-Wheelers']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			
	}

}
