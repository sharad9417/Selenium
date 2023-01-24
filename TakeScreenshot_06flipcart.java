package Basic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot_06flipcart {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File tempfile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File("./errorshots/flip1.png");
		//tempfile.renameTo(destfile);
		FileUtils.copyFile(tempfile, destfile);
	}

}
