package main.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author mayank.soni
 * 
 *         https://www.guru99.com/installing-selenium-webdriver.html
 *         
 *         
 *         form page for selenium practice
 *
 */

public class FirstSelenium {

	public static void main(String[] args) {

		// config webdriver operation
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//a[@href='http://toolsqa.com/automation-practice-form/']"));
		//First name = driver.findElement(By.Name("firstname");
		driver.findElement(By.name("firstname")).sendKeys("Divya");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.id("lastname")).sendKeys("Neema");
		//Radio Button
		
		WebElement Female = driver.findElement(By.id("sex-1"));
		Female.click();
       //Date		
		 driver.findElement(By.id("datepicker")).sendKeys("07/03/2019");
		 //Checkbox
		 WebElement ManualTester = driver.findElement(By.id("profession-0"));
		WebElement AutomationTester= driver.findElement(By.id("profession-1"));

	        // This will Toggle the Check box 		
	        ManualTester.click();			

	        // Check whether the Check box is toggled on 		
	        if (ManualTester.isSelected()) 
	        {					
	            System.out.println("Checkbox is Toggled On");					

	        }
	        else 
	        {			
	            System.out.println("Checkbox is Toggled Off");
        		
		
	        }
	        AutomationTester.click();			

	        // Check whether the Check box is toggled on 		
	        if (AutomationTester.isSelected()) 
	        {					
	            System.out.println("Checkbox is Toggled On");					

	        }
	        else 
	        {			
	            System.out.println("Checkbox is Toggled Off");
        		
		
	        }
	        

     }
}