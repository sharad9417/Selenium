package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnable_mtdforjdk_disable {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			
			WebDriver  driver=new 	ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html");
			Thread.sleep(2000);
			driver.findElement(By.linkText("jre-8u201-linux-i586.rpm")).click();
			Thread.sleep(2000);
			 boolean ele=driver.findElement(By.partialLinkText("Download jre-8u201-linux-i586.rpm")).isEnabled(); 
			 System.out.println(ele);
			
	}

}
