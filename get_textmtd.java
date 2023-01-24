package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_textmtd {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			
			WebDriver  driver=new 	ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			String expectedtext="Please identify yourself";
			String ele=driver.findElement(By.id("headerContainer")).getText();
			//System.out.println(ele);
			if(ele.contains(expectedtext))
			{
				System.out.println("passed text is same");
			}
			else
			{
				System.out.println("passed text is not same");
			}
	}

}
