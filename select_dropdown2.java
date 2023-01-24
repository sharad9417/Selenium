package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_dropdown2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		WebElement allcountry = driver.findElement(By.id("Form_getForm_Country"));
		Select s=new Select(allcountry);
	            List<WebElement> ele = s.getOptions();
	            for( WebElement countryname:ele)
	            {
	            	System.out.println(countryname.getText());
	            }
		
	}

}
