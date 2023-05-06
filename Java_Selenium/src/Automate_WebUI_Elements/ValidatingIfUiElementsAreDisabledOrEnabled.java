package Automate_WebUI_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ValidatingIfUiElementsAreDisabledOrEnabled {

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver",  "D:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com");
		/*
		// isEnabled() is not working properly.
		System.out.println(driver.findElement(By.id("custom_date_picker_id_2")).isEnabled());
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip")).click();
		System.out.println(driver.findElement(By.id("custom_date_picker_id_2")).isEnabled());
		*/
		
		//System.out.println(driver.findElement(By.id("marketDate_2")).getAttribute("style"));
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip")).click();
		//System.out.println(driver.findElement(By.id("marketDate_2")).getAttribute("style"));
		
		if (driver.findElement(By.id("marketDate_2")).getAttribute("style").contains("1"))
		{
			System.out.println("its enabled..");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		driver.quit();

	}

}
