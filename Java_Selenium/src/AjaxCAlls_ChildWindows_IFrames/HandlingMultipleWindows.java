package AjaxCAlls_ChildWindows_IFrames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.cssSelector("div[class='example'] a")).click();
		System.out.println(driver.getTitle());// here it will give parent page title only
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it= ids.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());


	}

}
