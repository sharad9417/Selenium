package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssselectorFlipcart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("img[alt='Grocery']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("img[alt='Mobiles']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("img[alt='2-Wheelers']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("img[alt='Appliances']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		driver.findElement(By.cssSelector("img[alt='Travel']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		//driver.findElement(By.cssSelector("img[alt='Beauty, Toys & More']")).click();
				//driver.navigate().back();
		
		/*driver.findElement(By.cssSelector("img[alt='Fashion']")).click();
		driver.navigate().back();
		
		driver.findElement(By.cssSelector("img[alt='Electronics']")).click();
		driver.navigate().back();
	
		driver.findElement(By.cssSelector("img[alt='Home']")).click();
		driver.navigate().back();*/
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
