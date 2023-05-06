package Basic_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RunMicrosoftEdge {
	public static void main(String [] args)
	{
		System.setProperty("webdriver.edge.driver", "D:\\WebDrivers\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://google.com");
		System.out.println("Title is: "+driver.getTitle());
		
	}

}
