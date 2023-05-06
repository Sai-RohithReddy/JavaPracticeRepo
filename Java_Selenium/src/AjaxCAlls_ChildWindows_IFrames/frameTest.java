package AjaxCAlls_ChildWindows_IFrames;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");
		/*
		int frameCount = driver.findElements(By.tagName("iframe")).size();
		System.out.println(frameCount);
		*/
		System.out.println(driver.findElements(By.tagName("iframe")).size());// counting no of frame in a page
		
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));//switching to frames using css.
		//driver.switchTo().frame(0);//switching to frames using index.
		driver.findElement(By.id("draggable")).click();
		
		Actions a = new Actions(driver);// action class is used to perform drag and drop performances. 
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		System.out.println(driver.findElement(By.id("droppable")).getText());
		a.dragAndDrop(source, target).build().perform();
		System.out.println(driver.findElement(By.id("droppable")).getText());
		
		driver.switchTo().defaultContent(); //coming out from frames
		
		driver.findElement(By.xpath("//div[@class='demo-list']/ul/li[2]")).click();
	
	}

}
