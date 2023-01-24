package Basic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.language.Document;

public class Javascriptexecutor_Scrollar {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.bankofbaroda.in/");
		driver.get("https://www.naukri.com/");
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		Object element = jse.executeScript("return document.body.scrollHeight");
			long heigth=(long)element;
			System.out.println(heigth);
			
			long Heigth1 = (long)jse.executeScript("return document.body.scrollHeight");
			System.out.println(Heigth1);
		/*jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(document.body.scrollWidth,0)");*/
			
			Object ele = jse.executeScript("return document.location.href");
			System.out.println(ele);
		
		
		
		
	
	}

}
