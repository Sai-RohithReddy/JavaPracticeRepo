/*
 HTML basics..
 
 <input class="inputtext" name="email"...>
 
 input - TagName.
 class, name - Attributes
 inputtext, email - values for that particular attributes.
 --------------------------------------------------------------------
 
 Css syntax 1:  tagName[attribute='value']
 
 input[class='inputtext']
 [class='inputtext']
 
 Css syntax 2:  tagName#id
 
 input#class
 
 Css syntax 3:  tagName.classname
 
 input.inputtext
 
 #id
 .classname
 --------------------------------------------------------------------
 Regular expression
 We use regular exp when attribute value is to long and value are not constant.
 
 syntax: tagName[attribute*='value']
 
 input[class*='inputtext']
 
 */

// validating Css0 in browsers:  $("Css")

package Locator_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssUsingFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\WebDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://facebook.com");
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("Rohith@test.com");// we can use this css only if html has 'id' in it
		driver.findElement(By.cssSelector("[id='pass']")).sendKeys("123");
		
		//driver.findElement(By.cssSelector("button[name='login']")).click();
		driver.findElement(By.cssSelector("button[name*='login']")).click(); // Regular expression

		driver.quit();

	}

}
