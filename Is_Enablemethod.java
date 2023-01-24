package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Enablemethod {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			
			WebDriver  driver=new 	ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			// boolean ele = driver.findElement(By.id("username")).isEnabled();
			// System.out.println(ele); 
			
			 WebElement ele=driver.findElement(By.id("username"));
			 if (ele.isEnabled()) {
				 System.out.println("true:targed element is enabled"); //o/p true:targed element is enabled
				
			}
			 else
			 {
				 System.out.println("false:targed element is not enabled");
			 }
	}

}
