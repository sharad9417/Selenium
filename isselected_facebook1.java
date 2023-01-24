package Basic;
/*
 * with held of fixed element it is selected or not
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected_facebook1 {
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/signup");
	     WebElement ele=driver.findElement(By.xpath("//label[text()='Male']"));
	          if(ele.isSelected())
	          	{
	    	         System.out.println("true:targeted element is select");
	           }
	          else
	          {
	        	  System.out.println("false:targeted element is not selected");
	          }
	          Thread.sleep(2000);
	          ele.click();
	          Thread.sleep(2000);
	          
	          if(ele.isSelected())
	          	{
	    	         System.out.println("true:targeted element is select");
	           }
	          else
	          {
	        	  System.out.println("false:targeted element is not selected");
	          }
	          
	          
	          
	    
	    
	}

}
