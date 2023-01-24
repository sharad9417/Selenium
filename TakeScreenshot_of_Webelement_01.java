package Basic;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot_of_Webelement_01 {
	public static void main(String[] args) throws IOException {
		LocalDateTime ldt=LocalDateTime.now();
		String timestamp = ldt.toString().replace(':', '-');
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demo.actitime.com/login.do");
		WebElement element = driver.findElement(By.id("loginButton"));
		
		
		File tempfile=element.getScreenshotAs(OutputType.FILE);
		File destfile=new File("./errorshots1/button"+timestamp+".png");
		FileUtils.copyFile(tempfile, destfile);
		
		
		 
	}

}
