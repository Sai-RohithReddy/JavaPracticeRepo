package Automate_WebUI_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingJavaAlerts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String name1 = "Rohith";
		String name2 = "Nani";
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name1);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept(); // only we can accept it after alert is visible.
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name2);
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		

		driver.quit();
	}

}
