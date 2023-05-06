package Basic_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\WebDrivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		
		System.out.println("Title is: "+driver.getTitle());

	}

}
