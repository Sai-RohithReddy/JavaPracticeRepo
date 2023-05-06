
/*
 HTML basics..
 
 <input class="inputtext" name="email"...>
 
 input - TagName.
 class, name - Attributes
 inputtext, email - values for that particular attributes.
 --------------------------------------------------------------------
 
 Xpath syntax:  //tagName[@attribute='value']
 
 //input[@class='inputtext']
 //*[@class='inputtext']
  --------------------------------------------------------------------

Regular expression
//tagName[contains(@attribute,'value')]

//input[contains(@class,'inputtext')]

 */

// validating xpath in browsers:  $x("xpath") 

package Locator_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathUsingFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\WebDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://facebook.com");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Rohith@test.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123");
		
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.xpath("//button[contains(@name,'login')]")).click(); // Regular expression
		
		driver.quit();
		System.out.println("Pass");
	}

}
