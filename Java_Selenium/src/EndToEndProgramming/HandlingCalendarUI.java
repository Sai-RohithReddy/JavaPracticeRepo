package EndToEndProgramming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalendarUI {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		driver.findElement(By.cssSelector(".active.day")).click();
		
		
		driver.quit();

	}

}
