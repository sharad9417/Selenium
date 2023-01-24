package Basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gettitle {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver=new 	ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wd = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://demo.actitime.com/login.do");
		String elementofacti=driver.getTitle();
		System.out.println(elementofacti);
		wd.until(ExpectedConditions.titleIs(elementofacti));
		String actualtitle="actiTIME - Logins";
		
		if( actualtitle.equals(elementofacti))
		{
			System.out.println("true:title is same");
		}
		else {
		System.out.println("false:title is not same");
		}
	}
}
