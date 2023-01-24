package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssflipcart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
      
        driver.findElement(By.cssSelector("img[alt='Grocery']")).click();
        driver.navigate().back();
        
	}

}
