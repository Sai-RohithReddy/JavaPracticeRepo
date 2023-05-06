package Locator_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WritingInEditBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("rohith@test.com");//entering user using "id"
		driver.findElement(By.name("pass")).sendKeys("123");// entering password using "name"
		driver.findElement(By.className("_9lsb")).click();// clicking the hide password button after entering password.
		/* 
		// here both name values are same now selenium will not throw any error.. it will just pick first element from the browser it will not move to password section.
		driver.findElement(By.name("email")).sendKeys("rohith@test.com");//Email: rohith@test.com123
		driver.findElement(By.name("email")).sendKeys("123");
		*/
		
		driver.findElement(By.linkText("Forgotten password?")).click();// clicking on Forgot account using "linktext"
		
		driver.quit();

	}

}
