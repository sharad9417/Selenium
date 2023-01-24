package Basic;
/*XPATH BY TEXT FUNCTION
 * */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2Xpath_By_text_function{
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//div[text()='Grocery']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Fashion']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Electronics']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Home']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Appliances']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Travel']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Beauty, Toys & More']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='2-Wheelers']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
	}

}
