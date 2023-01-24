package Basic;
/*
 * selectByValue method
 */
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_selectbyvalue {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement allmonth = driver.findElement(By.id("month"));
		Select s=new Select(allmonth);
		
	          List<WebElement> alloption = s.getOptions();
	          for(WebElement ele:alloption)
	          {
	        	  //System.out.println( ele.getAttribute("value"));
	        	  s.selectByValue(ele.getAttribute("value"));
	          }
	}

}
