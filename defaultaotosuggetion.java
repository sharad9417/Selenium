package Basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class defaultaotosuggetion {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			
			WebDriver  driver=new 	ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.google.com/");
			driver.findElement(By.name("q")).click();
			List<WebElement> defausuggetion = driver.findElements(By.xpath("//li[@class='sbct' and not(@id='YMXe')]"));
			for(WebElement ele:defausuggetion)
			{
				System.out.println(ele.getText());
			}
			
	}

}
