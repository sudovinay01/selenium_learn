package selenium_learn;

import org.openqa.selenium.By;      
import org.openqa.selenium.WebDriver;              
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/mahes/Desktop/selenium/selenium/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://duckduckgo.com/");  
		
		driver.findElement(By.id("search_form_input_homepage")).sendKeys("progress software");  
		
		driver.findElement(By.id("search_form_input_homepage")).submit(); 
		
		System.out.println(driver.getCurrentUrl()+"\n"+driver.getTitle());
		System.out.println(driver.getCurrentUrl().length()+"\n"+driver.getTitle().length());
		
		driver.close();  

	}

}
