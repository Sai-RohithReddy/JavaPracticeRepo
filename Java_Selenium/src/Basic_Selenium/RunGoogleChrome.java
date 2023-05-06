package Basic_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunGoogleChrome {

	public static void main(String[] args) {
		// invoke driver(.exe) file first
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		
		// Create driver object for chrome browser
		WebDriver driver = new ChromeDriver();//ChromeDriver() is class for chrome browser.
		
		// Hitting url on the browser.
		driver.get("https://google.com");
		
		// Validate if our page title is correct.
		System.out.println("Title of the page is: "+driver.getTitle());
		
		// validate if we are landed on correct url.
		System.out.println("url which we opened in ChromeBrowser: " + driver.getCurrentUrl());
		
		// navigating from one page to another page
		//driver.get("https://yahoo.com");
		driver.navigate().to("https://yahoo.com");
		
		// navigate back to google from yahoo using selenium.
		driver.navigate().back();
		
		driver.navigate().forward();
		
		System.out.println("******************************************************************");
		// Print page source
		//System.out.println(driver.getPageSource());
		
		driver.quit();//It closes all the browsers opened by selenium script
		//driver.close();//it closes current browser

	}

}
