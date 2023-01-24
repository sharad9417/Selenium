package Basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle10172022 {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		ChromeDriver driver=new 	ChromeDriver();
	
		driver.get("https://licindia.in/");
	/*	1) Dimension ele=driver.manage().window().getSize();
		System.out.println("Width="+ele.getWidth());
		System.out.println("Height="+ele.getHeight()); */
		
		/* 2) Dimension dim=new Dimension(1100, 800);  //change the page size.
		driver.manage().window().setSize(dim) ; */
		
		/* Point ele = driver.manage().window().getPosition();
		System.out.println("Start X"+ele.getX());
		System.out.println("Start Y"+ele.getY());*/
		
		
		Point pt=new Point(50, 40);
		driver.manage().window().setPosition(pt); //reduce the page size
		
		
		
	}
	

}
