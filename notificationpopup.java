package Basic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notificationpopup {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		/*ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);*/
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		   //driver.get("https://www.justdial.com/");
		driver.get("https://demo.guru99.com/test/upload/");
		   driver.findElement(By.id("file_wraper0")).click();
		   Thread.sleep(2000);
		   Runtime.getRuntime().exec("C:\\Users\\Admin\\Desktop\\sharad1.exe");
		  
		
	}

}
