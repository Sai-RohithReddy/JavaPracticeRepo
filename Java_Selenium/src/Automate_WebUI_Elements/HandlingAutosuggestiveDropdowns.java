/*diff b/w dynamic and autosuggestive dropdowns
in dynamic options will be seen directly where as in autosuggestive we will get the options based on our input.
*/
package Automate_WebUI_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingAutosuggestiveDropdowns {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",  "D:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(1000);// used to not overlap (or) if there is any slight delay in browser selenium will jump into next step without completing current one then use Thread
		
		// parent child traversing
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));// assigining all list of webelements in one list
		
		for (WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}

	}

}
