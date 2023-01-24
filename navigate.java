package Basic;
/*
 * interview quetion diff between navigate.to and get method
 */

import org.openqa.selenium.chrome.ChromeDriver;
public class navigate {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	
	ChromeDriver d1=new 	ChromeDriver();
	d1.get("https://www.facebook.com/");
	d1.get("https://www.flipkart.com/");
	
	d1.navigate().back();  //execute facebook,flipcart,facebook
	d1.navigate().forward();//execute facebook,flipcart,facebook,flipcart
	d1.navigate().refresh();
	
	Thread.sleep(3000);
	d1.navigate().refresh();
	

	}
}
