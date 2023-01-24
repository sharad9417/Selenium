package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ex_im_th {
	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver=new 	ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wd = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		
		String Expectedurl = "https://demo.actitime.com/user/submit_tt";
		Thread.sleep(2000);
		wd.until(ExpectedConditions.urlToBe(Expectedurl));
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
		if(currenturl.contains(Expectedurl))
		{
			System.out.println("true:url is matching");
		}
		else
		{
			System.out.println("false:url is not matiching");
		}
		
	}

}
