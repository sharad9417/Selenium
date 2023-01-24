package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class url {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String expectedurl="https://demo.actitime.com/login.do";
		String element=driver.getCurrentUrl();
		//driver.findElement(By.id("username"))
		System.out.println(element);
		
		if(element.equals(expectedurl))
		{
			System.out.println("title is same");
		}
		else
		{
			System.out.println("Title is not same");
		}
	}

}
