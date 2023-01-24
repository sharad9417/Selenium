package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddendivisionpopup {
 public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		   driver.get("https://www.naukri.com/");
		   driver.findElement(By.linkText("Login")).click();
		   driver.findElement(By.cssSelector("input[placeholder='Enter your active Email ID / Username']")).sendKeys("sharadshinde1997@gmail.com");
		   driver.findElement(By.cssSelector("input[placeholder='Enter your password']")).sendKeys("SUS@nmp01");
		   driver.findElement(By.xpath("//button[text()='Login']")).click();
}

}
