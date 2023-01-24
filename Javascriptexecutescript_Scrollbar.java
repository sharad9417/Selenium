package Basic;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Javascriptexecutescript_Scrollbar{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.naukri.com/");
	
	   JavascriptExecutor jse=(JavascriptExecutor ) driver;
	   // jse.executeScript("window.alter(Enter your name)");
	   jse.executeScript("window.scrollBy(0,2000)");  //scrolling top down
	   Thread.sleep(2000);
	   jse.executeScript("window.scrollBy(0,-2000)");  //scrolling down to top
	   Thread.sleep(2000);
	   jse.executeScript("window.scrollBy(500,0)");  //scrolling left to rigth
	   Thread.sleep(2000);
	   jse.executeScript("window.scrollBy(-500,0)");  //scrolling rigth to left
	    
	   
	   
	   
	   
	   
	   
	   
	   
	}

}
