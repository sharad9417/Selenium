package Basic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptfileupload {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");
		  driver.findElement(By.id("file_wraper0")).click();
		  Thread.sleep(2000);
		  Runtime.getRuntime().exec("C:\\Users\\Admin\\Desktop\\All Desktop\\ALL FOLDER\\Sharad CV AND Resume\\old cv1\\callid.exe");
	}

}
