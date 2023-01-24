package Basic;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot_insta_03 {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.instagram.com/");
         TakesScreenshot ts=(TakesScreenshot) driver;
                 File tempfile = ts.getScreenshotAs(OutputType.FILE);
                 File destfile = new File("./errorshots/insta.png");
                 tempfile.renameTo(destfile);
               
         
	}

}
