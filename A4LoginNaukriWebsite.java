package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A4LoginNaukriWebsite {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		 //System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			
			WebDriver  driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.naukri.com/");
			
			driver.findElement(By.xpath("//a[text()='Login']")).click();
			
			WebElement ele=driver.findElement(By.cssSelector("input[placeholder='Enter your active Email ID / Username']"));
			Thread.sleep(2000);
			ele.sendKeys("sharadshinde1997@gmail.com");
			
			ele=driver.findElement(By.cssSelector("input[placeholder='Enter your password']"));
			Thread.sleep(2000);
			ele.sendKeys("SUS@nmp01");
			
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("button[type='submit']")).click();
		
	}

}
