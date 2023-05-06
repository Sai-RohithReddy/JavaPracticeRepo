// For Assertions we need to depend on any testing frameworks like TestNG or JUnit

package Automate_WebUI_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionsInAutomationTesting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",  "D:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com");
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizen']")).isSelected());// if the statement will fail then the test will stop we no need to check it using console.
		driver.findElement(By.cssSelector("input[id*='SeniorCitizen']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizen']")).isSelected());
		 
		/*
		int a = driver.findElements(By.cssSelector("div[id='divdiscountcheckbox'] input[type='checkbox']")).size();
		int b = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println("Total no of checkboxes in entire page are: "+b+" and checkbpxes only in Special Assestance are: "+a);
		*/
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 21);
		System.out.println("Test execution succesfull..");
		
		driver.quit();

	}

}
