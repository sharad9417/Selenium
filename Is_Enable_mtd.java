package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Enable_mtd {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			
			WebDriver  driver=new 	ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
			
			WebElement ele=driver.findElement(By.xpath("//button[text()='Submit']"));
			ele.click();
			//ele.sendKeys(Keys.ENTER);
			if (ele.isEnabled()) {
				 System.out.println("true:targed element is enabled"); //o/p true:targed element is enabled
				
			}
			 else
			 {
				 System.out.println("false:targed element is not enabled");
			 }
	}

	}


