// if an object has select tag then it cones to static dropdown category. 
package Automate_WebUI_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandlingStaticDropdowns {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",  "D:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com");
		
		// use the select class to manipulate the dropdowns in Selenium.
		Select s = new Select(driver.findElement(By.xpath("//select[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency']")));
		// different ways to ways to select
		s.selectByValue("EUR");
		s.selectByIndex(1);
		s.selectByVisibleText("INR");
		//s.deselectByIndex(1);
		// we can only do all this operations on a dropdown only when we have dropdown webelement as select as a tag and all the options have option tag
		
		
		driver.quit();

	}

}
