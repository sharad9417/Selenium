package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected_facebook {
	public static void main(String[] args) throws InterruptedException {
		

	 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver  driver=new 	ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement ele = driver.findElement(By.xpath("//label[text()='Female']/parent::span//input[@type='radio']"));
		 if(ele.isSelected())
		 {
			 System.out.println("true:targeted element is selected");
		 }
		 else
		 {
			 System.out.println("false:targed element is not selected"); // op false:targed element is not selected
		 }
	Thread.sleep(2000);
		 ele.click();
		 Thread.sleep(2000);
		 
		 if(ele.isSelected())
		 {
			 System.out.println("true:targeted element is selected");
		 }
		 else
		 {
			 System.out.println("false:targed element is not selected"); //op true:targeted element is selected
		 }
}

}



