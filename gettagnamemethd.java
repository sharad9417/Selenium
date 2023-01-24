package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettagnamemethd {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			
			WebDriver  driver=new 	ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			 String ele = driver.findElement(By.xpath("//*[@name='username']")).getTagName();
			 System.out.println(ele);
	}

}
