package Basic;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotof_Webpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver  driver=new 	ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demo.actitime.com/login.do");
		driver.get("https://shop-global.malaicha.com/login");
         TakesScreenshot ts=(TakesScreenshot) driver;  //downcasting
         File tempfile = ts.getScreenshotAs(OutputType.FILE);   //after taking screenshot it stored inthe form of file
        /* System.out.println(tempfile.getAbsolutePath());//it is complete path whre my screenshot is stored
         Thread.sleep(90000);*/
         File destfile=new File("./errorshots/malaika.png");  //destination file
         tempfile.renameTo(destfile); //temp file ranme to destination file
         
	}

}
