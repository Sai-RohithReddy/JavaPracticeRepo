// Handling Ajax Mouse Interactions.

package AjaxCAlls_ChildWindows_IFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
		// build() means it will build the step which is just ready to execute, it will not execute immediately. If we want to execute that particular build we need to use perform(). 
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).contextClick().build().perform();
		// contextClick() is used to right click.
	}

}
