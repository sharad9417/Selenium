package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loator_class {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");
        driver.findElement(By.className("close")).click();
        Thread.sleep(4000);
       // driver.quit();
        
	}

}
