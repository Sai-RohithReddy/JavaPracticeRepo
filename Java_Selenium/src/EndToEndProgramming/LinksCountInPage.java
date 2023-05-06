package EndToEndProgramming;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LinksCountInPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Actions a = new Actions(driver);
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		// COUNTING TOTAL NUMBER OF LINKS IN A PAGE
		System.out.println("Total no of links in page are: " + driver.findElements(By.tagName("a")).size());
		
		/*
		// Method 1(wrong method XXX, unable to pull all links)
		int footerLinkCount = driver.findElements(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td/ul/li/a")).size();
		System.out.println("Total no of links in footer area: " + footerLinkCount);
		
		//OR
		*/
		// Method 2
		
		// COUNTING ONLY FOOTER LINKS IN A PAGE(By taking one web element that have all footer links)
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		int footerLinkCount = footerDriver.findElements(By.tagName("a")).size(); 
		System.out.println("Total no of links in footer area: " + footerLinkCount);
		
		// COUNTING ONLY FOOTER FIRST COLUMN LINKS IN A PAGE.
		
		WebElement footerColumnDriver = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]"));// "//table/tbody/tr/td[1]/ul"
		int footerFirstColumnLinks=footerColumnDriver.findElements(By.tagName("a")).size();
		System.out.println("Total no of links in footer first column area: "+ footerFirstColumnLinks);
		
		// CLICK ON EACH LINK IN THE COLUMN AND CHECK IF THE PAGES ARE OPENING.
		
		for(int i = 1;i < footerFirstColumnLinks;i++)
		{
			//a.moveToElement(footerColumnDriver.findElement(By.tagName("a"))).keyDown(Keys.CONTROL).click().build().perform();
			// or
			
			String clickingLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerColumnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickingLinkTab);
			Thread.sleep(5000);
		}
		
		// GETTING THE TITLE OF EACH TAB
		
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> i = abc.iterator();
		
		while(i.hasNext())
		{
			System.out.println("");
			driver.switchTo().window(i.next());
			System.out.println(driver.getTitle());
		}
		
		driver.quit();
	}

}
