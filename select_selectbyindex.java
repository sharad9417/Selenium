package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_selectbyindex {
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/signup");
			//WebElement allmonth = driver.findElement(By.id("month"));
			WebElement alldate = driver.findElement(By.id("day"));
			//Select s=new Select(allmonth);
			Select s=new Select(alldate);
			//s.selectByIndex(0);
			List<WebElement> month = s.getOptions();
		//	for(int i=0;i<=11;i++) OR
		//	for(int i=0;i<=s.getOptions().size()-1;i++)
			s.deselectByIndex(month.size()-1);
			for(int i=0;i<=month.size()-1;i++)
			{
				s.selectByIndex(i);
			}

	}

}
