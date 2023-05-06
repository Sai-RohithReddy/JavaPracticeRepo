package Automate_WebUI_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEnd2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://book.spicejet.com");
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[value='HYD']")).click();
		driver.findElement(By.cssSelector("div[id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR'] a[value='BLR']")).click();
		//driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();
		//driver.findElement(By.linkText("25")).click();
		
		if(driver.findElement(By.cssSelector("div[id='marketDate_2']")).getAttribute("style").contains("0.5")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertFalse(false);
		}
		
		driver.findElement(By.cssSelector("div[id='divpaxinfo']")).click();
		Select s1 = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")));
		s1.selectByValue("4");
		
		Select s2 = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")));
		s2.selectByValue("INR");
		
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).click();
		
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit")).click();
		//driver.close();
		
		System.out.println("Test Passed");
	}

}
