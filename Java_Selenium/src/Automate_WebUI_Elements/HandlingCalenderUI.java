package Automate_WebUI_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalenderUI {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",  "D:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();//this css selects current date in calender
		
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		driver.findElement(By.xpath("(//td[@data-handler='selectDay'])[3]/a")).click();// this will select alternate day from current day.
		
		
		System.out.println("current date selected..");
		driver.quit();
	}

}
