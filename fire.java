package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fire {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			//Thread.sleep(2000);
			driver.get("https://demo.actitime.com/login.do");
		
	}

}
