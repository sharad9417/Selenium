package Basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class authonticationpopup {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			   driver.get("https://admin:admin@https://the-internet.herokuapp.com/basic_auth");
	}

}
