package Basic;
/*
 * submit() mtd work only when the source code having <form>sign in </form> and button='submit'
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submitmethodofwebelement {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			
			WebDriver  driver=new 	ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.vtiger.com/vtigercrm/");
			  driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
			
	}

}
