package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptclickongoogledoodle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/doodles");
	   JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		for(;;)
		{
		try
		{
			driver.findElement(By.linkText("Mother's Day 2022 (October 16)")).click();
			break;
		}
		catch (NoSuchElementException e) {
			jse.executeScript("window.scrollBy(0,900)");
		}
		}
		
	}
	
}
