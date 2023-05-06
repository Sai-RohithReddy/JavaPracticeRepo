package Locator_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildRelationshipXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=eu");
		// if we are not having any unique attributes and willing to find the particular xpath, go and find the parent/grand parent/... tag uniquely. 
		driver.findElement(By.xpath("//form[@id='login_form']/div/div/input")).sendKeys("rohith@test.com");
		// "//form[@id='login_form']/div/div[2]/div/input"   use the indentation if the parent class contain same tagnames.
		driver.findElement(By.xpath("//div[@id='content']/div[3]/form/input[2]")).sendKeys("123");
		
		driver.quit();
		
		
	}

}
