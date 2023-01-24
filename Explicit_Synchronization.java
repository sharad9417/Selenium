package Basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Synchronization {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wd=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		String expectedtitle = "actiTIME - Logins";
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
	   wd.until(ExpectedConditions.titleIs(expectedtitle));
		
		if(actualtitle.contains(expectedtitle))
		{
			System.out.println(" title is true");
		}
		else
		{
			System.out.println("title is false");
		}
		
	}
	

}
