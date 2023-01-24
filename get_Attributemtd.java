package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_Attributemtd {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			
			WebDriver  driver=new 	ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			 String ele = driver.findElement(By.id("username")).getAttribute("class");
			 System.out.println(ele); //textfield
		
			 String ele1 = driver.findElement(By.id("username")).getAttribute("pune");
			 System.out.println(ele1);//o/p null, because of  passed attribute name not present in tree Structure
			 
			 String ele2= driver.findElement(By.id("username")).getAttribute("value");
			System.out.println(ele2);  //it gives " " String
			 System.out.println(ele2.isEmpty()); //true because of isempty return type is boolean type
			 if(ele1!=null)
		{
			  if(ele2.isEmpty())
			  {
				 System.out.println("True:it is empty");
			  }
			  else
			  {
				 System.out.println("False:it is not empty");
			  }
		 } 
			 else
			 {
				 System.out.println("false:Atribute is not present in html");
			 }
	}

}
