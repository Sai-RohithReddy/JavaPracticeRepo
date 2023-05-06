package Automate_WebUI_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckbox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",  "D:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com");
		
		//boolean check = driver.findElement(By.cssSelector("input[id*='SeniorCitizen']")).isSelected();// it let us know whether check box is selected or not
		//System.out.println(check);
		driver.findElement(By.cssSelector("input[id*='SeniorCitizen']")).click();
		 boolean check = driver.findElement(By.cssSelector("input[id*='SeniorCitizen']")).isSelected();// it let us know whether check box is selected or not
		 System.out.println(check);
		 
		 //Count the no of checkbosex.
		 //int a = driver.findElements(By.cssSelector("div[id='divdiscountcheckbox'] input[type='checkbox']")).size();
		 int a = driver.findElements(By.xpath("//div[@id='divdiscountcheckbox'] //input[@type='checkbox']")).size();
		 int b = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		 System.out.println("Total no of checkboxes in entire page are: "+b+" and checkbpxes only in Special Assestance are: "+a);
		 
		 driver.quit();
	}

}
