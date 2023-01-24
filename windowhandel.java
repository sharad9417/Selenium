package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandel {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		ChromeDriver d1=new 	ChromeDriver();
		d1.get("https://demoqa.com/browser-windows");
		String element=d1.getWindowHandle();
		System.out.println(element);  //give the windows id
	}

}
