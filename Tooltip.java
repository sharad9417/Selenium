package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			
			WebDriver  driver=new 	ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			String expectedtooltip="Do not select if this computer is shared";
			 String actualtooltip = driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");
			 //System.out.println(ele); 
			 if(actualtooltip!=null)
			 {
			 if(actualtooltip.contains(expectedtooltip))
			 {
				 System.out.println("true:tooltip is matching");
			 }
			 else
			 {
				 System.out.println("false:tooltip is not matching ");
			 }
			 }
			 else
			 {
				 System.out.println("false");
			 }
	}

}
