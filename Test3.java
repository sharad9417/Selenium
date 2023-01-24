package Basic;

	import org.openqa.selenium.chrome.ChromeDriver;

	public class Test3 {
		public static void main(String[] args) {
			//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			
			ChromeDriver d1=new 	ChromeDriver();
			d1.get("https://demo.actitime.com/login.do");
			String elementofacti=d1.getTitle();
			System.out.println(elementofacti);
			String actualtitle="actiTIME - Login";
			
			if(elementofacti.equals(actualtitle))
			{
				System.out.println("true:title is same");
			}
			else {
			System.out.println("false:title is not same");
			}
		}


}
