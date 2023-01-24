package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googledoodle {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/doodles");
			Thread.sleep(2000);
			driver.findElement(By.linkText("Poland National Day 2022")).click();
	}

}
