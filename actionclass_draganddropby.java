package Basic;
/*
 * we put zero 0 in frame mtd because we put index value in the frame method and 
 */
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass_draganddropby {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver  driver=new 	ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/draggable/");
		//WebElement element = driver.findElement(By.xpath("//p[text()='Drag me around']"));
		driver.switchTo().frame(0); //trasfer the control one frame to another frame
		WebElement element = driver.findElement(By.id("draggable"));
		Actions action=new Actions(driver);
		action.dragAndDropBy(element, 0, 100);
		action.perform();
	}

}
