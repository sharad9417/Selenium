package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_Getfirstselectedoption {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
	    //WebElement allmonth = driver.findElement(By.id("month"));
		WebElement days = driver.findElement(By.id("day"));
	   // Select s=new Select(allmonth);
		Select s=new Select(days);
	    WebElement element = s.getFirstSelectedOption();
	    System.out.println(element.getText());
	    
	}

}
