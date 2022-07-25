package selenium_learn;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;  
//import org.openqa.selenium.remote.DesiredCapabilities;  
//import org.openqa.selenium.support.ui.Select;  
  
public class Third {  
  
    public static void main(String[] args) {  
          
 
    	System.setProperty("webdriver.gecko.driver", "C:/Users/mahes/Desktop/selenium/selenium/geckodriver.exe");
		      
    	WebDriver driver = new FirefoxDriver();
    	
    	driver.get("file:///C:/Users/mahes/Desktop/selenium/radio.html");  
           
    	 

    	int a = driver.findElements(By.xpath("//input [@name='group2']")).size();  
    	System.out.println(a);  
//         for(int i=1;i<=a;i++)  
//         {  
             driver.findElements(By.xpath("//input[@name='group2']")).get(2).click();  
//         }  
         
//         driver.close(); 
    	
    }  
  
}  