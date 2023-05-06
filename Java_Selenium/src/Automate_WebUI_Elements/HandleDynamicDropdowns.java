package Automate_WebUI_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicDropdowns {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",  "D:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://book.spicejet.com/");
		
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		Thread.sleep(1000);// to prevent any Synchronization issues
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();// if your code is not approved because of indexing the use parent chaild method.
		
		// using parent child relation ship xpath. (parent-child relationship locator to identify the object uniquely)
		driver.findElement(By.xpath("//div[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR'] //a[@value='BLR']")).click();
		// //div[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']-> parent," space ",//a[@value='BLR']-> child.
	
		driver.quit();
		
		System.out.println("Test passed..");

	}

}
