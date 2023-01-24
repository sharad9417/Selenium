package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript_disable_click {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html");
	
		
		//jse.executeScript("window.scrollBy(0,300)");
		//Thread.sleep(2000);
		  driver.findElement(By.linkText("jdk-8u202-linux-arm32-vfp-hflt.tar.gz")).click();
		    JavascriptExecutor jse=(JavascriptExecutor)driver;
		   WebElement element = driver.findElement(By.partialLinkText("Download jdk-8u202-linux-arm32-vfp-hflt.tar.gz"));
	         jse.executeScript("arguments[0].click()", element);
		
	}

}
