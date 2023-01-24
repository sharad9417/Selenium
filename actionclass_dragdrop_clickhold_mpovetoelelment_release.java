package Basic;
/*
 * clickandhold(targeted element),moveToElement(targed element),Release()
 */
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass_dragdrop_clickhold_mpovetoelelment_release {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver  driver=new 	ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement source = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement dest = driver.findElement(By.id("column-3"));
		//WebElement dest = driver.findElement(By.xpath("//h1[text()='Block 3']"));
		Actions action=new Actions(driver);
		//action.dragAndDrop(source, dest);
		action.clickAndHold(source).moveToElement(dest).release(); //other way of drag and drop
		action.perform();
	}

}
