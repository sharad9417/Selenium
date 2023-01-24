package Basic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxget {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
	
	FirefoxDriver  driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	
	}
}
