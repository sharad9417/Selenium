package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Managemtd {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		ChromeDriver driver=new 	ChromeDriver();
		driver.get("https://licindia.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		System.out.println(driver.manage().window().getSize()); //return type in dimension
		//driver.get("https://licindia.in/");
	}

}
