package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class pagesource {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String actualpagesource = "Please identify yourself";
		String element = driver.getPageSource(); //give source code of webpage
		System.out.println(element);
		
		
		if(element.contains(actualpagesource))// equal mtd not 
		{
			System.out.println("true");
		}
		else
		{
			System.out.println(false);
		}
		driver.quit();
	}

}
//TOOLSQA website used
//close==>close thr targated webpage the we use close mtd for close the single webpage i.e close parent window
// quite==>if we are working on multiple webpage the we have go for quite mtd used for closed munltiple web page     
//quite is used all the window including child window