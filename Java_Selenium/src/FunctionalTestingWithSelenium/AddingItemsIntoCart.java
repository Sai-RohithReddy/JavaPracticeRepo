// Amazon Question: How to write the code in generic so it supports the multiple data sets.
package FunctionalTestingWithSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingItemsIntoCart {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",  "D:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++) // looping through each list webelement 
		{
			String product = products.get(i).getText(); //separate values using index
			// *checking only one single criteria*
			if (product.contains("Cucumber")) //checking for specific name
			{
				//click on Add to cart
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}

	}

}
