package Basic;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot_Automatic {
	public static void main(String[] args) {
		//fileutils concreate class i/o package
           System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
           WebDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://demo.vtiger.com/vtigercrm/");
           TakesScreenshot ts=(TakesScreenshot) driver;
          File tempfile =ts.getScreenshotAs(OutputType.FILE);
          
          File destfile=new File("./errorshots/vtiger.png");
          tempfile.renameTo(destfile);
           
	}

}
