package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) {
		/* String key,String value accenpt setproperty method
		 * driver is referrence variable.webdriver is interface , chrome is browser, /means immediate child,  . is current project*/
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String element =driver.getTitle();
		String actualelement = "Facebook – log in or sign up";	
		System.out.println(element);
		if (element.equals(actualelement))
		{
			System.out.println("true:Title is same");
		}
		else
		{
			System.out.println("false:Title is not same");
		}
		
		
	}

}
