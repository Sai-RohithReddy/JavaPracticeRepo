package Locator_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce_WritingInEditBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=eu");
		
		driver.findElement(By.id("username")).sendKeys("rohith@test.com");
		driver.findElement(By.name("pw")).sendKeys("123");
		
		String s = "---------------------------------------";
		
		try 
		{
			driver.findElement(By.className("button r4 wide primary")).click();//throws error. class should not have spaces.
		}
		catch(Exception e) 
		{
			System.out.println("There has been some issue with CLASSNAME.."+ "\n"+ s + "\n" +e.getMessage());
		}
		finally
		{
			//driver.findElement(By.name("Login")).click();
			//driver.findElement(By.xpath("//*[@id=\'Login\']")).click();// clicking login button using Xpath.
			driver.findElement(By.cssSelector("#Login")).click();// clicking login button using css.
		}
		
		System.out.println(s);
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		System.out.println(s);
		
		driver.quit();
		
		System.out.println(" ");
		System.out.println("Test passed..");

	}

}


