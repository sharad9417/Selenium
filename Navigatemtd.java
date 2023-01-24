package Basic;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatemtd {
	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		ChromeDriver d1=new 	ChromeDriver();
		//Navigation nav=new Remotenavigatio(); //upcasting
		//Navigation nav=d1.navigate();
		d1.get("https://licindia.in/");
		URL url=new URL("https://licindia.in/Products/Insurance-Plan");
		d1.navigate().to(url);
	}

}
