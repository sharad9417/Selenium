package Basic;
/*
 * getrect() mtd return type is Rectangle
 * getLOcation mtd return type is point
 * getsize mtd return type is Dimension
 */
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsize_getlocation_getrectmethod {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			
			WebDriver  driver=new 	ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			Dimension ele = driver.findElement(By.id("loginButton")).getSize();
			System.out.println("Width"+ele.getWidth());
			System.out.println("Heigth"+ele.getHeight());
			
			Point ele1 = driver.findElement(By.id("username")).getLocation();
			System.out.println("Start x"+ele1.getX());
			System.out.println("Start y"+ele1.getY());
			
			Rectangle ele2 = driver.findElement(By.id("username")).getRect();
			System.out.println(ele2.getHeight());
			System.out.println(ele2.getWidth());
			System.out.println(ele2.getX());
			System.out.println(ele2.getY());
			
			
	}

}
