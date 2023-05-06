package Basic_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class RunInternetExplorer {

	public static void main(String[] args) {

		{
			System.setProperty("webdriver.ie.driver", "D:\\WebDrivers\\MicrosoftWebDriver.exe");
				
			WebDriver driver = new InternetExplorerDriver();
			driver.get("https://google.com");
			System.out.println("Title is: "+driver.getTitle());
			
		}

	}
}

