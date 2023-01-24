package Basic;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot_util {
	public static void main(String[] args) throws IOException {
		LocalDateTime ldt = LocalDateTime.now();
		//System.out.println(ldt);
		String timestamp = ldt.toString().replace(':', '-');
		
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
        //driver.get("https://licindia.in/");
         //driver.get("https://www.instagram.com/");
         driver.get("https://demo.actitime.com/login.do");
        
		//TakesScreenshot ts=(TakesScreenshot) driver;
         WebElement element = driver.findElement(By.xpath("//div[text()='Login ']"));
         
         File tempfile = element.getScreenshotAs(OutputType.FILE);
        
      //  File destfile=new File("./errorshots1/lic.png"+timestamp);
        File destfile=new File("./errorshots1/acti"+timestamp+".png");
        //tempfile.renameTo(destfile);
        FileUtils.copyFile(tempfile, destfile);
		
	}

}
