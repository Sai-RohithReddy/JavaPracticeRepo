package Automate_WebUI_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class UpdatedDropdownLoopingUI {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",  "D:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/flights/");
		
		//driver.findElement(By.id("pax_link_common")).click();
		driver.findElement(By.xpath("//div[@class='sc-jJoQJp gzcbaP']/div")).click();
		//Thread.sleep(1000L);// wait for 2 sec, used to not miss match b/w above and below steps
		
		//System.out.println(driver.findElement(By.id("pax_label")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@class='sc-fotOHu hmnmkS']/div[5]/div/p[1]")).getText());
		
		for(int i=1; i < 4; i++)
		{
		//need to select 4 adults
			driver.findElement(By.xpath("//div[@class='sc-cZMNgc fLZUIB']/div[1]/div/span[3]")).click();
			//Thread.sleep(2000L);
		if (i >= 2)//not working need to check later
		{	
			//need to select 2 children
			driver.findElement(By.xpath("//div[@class='sc-cZMNgc fLZUIB']/div[2]/div/span[3]")).click();
		}
		}
		/*
		int i = 1;
		while (i < 4)
		{
			driver.findElement(By.id("adultPaxPlus")).click();
			i++;
			if (i > 2)
			{
				driver.findElement(By.id("childPaxPlus")).click();
			}
		}
		*/
		
		//Thread.sleep(2000L);
		//driver.findElement(By.xpath("//div[@class='sc-kHOZwM fTKYkT']/a[2]")).click();
		driver.findElement(By.linkText("Done")).click();
		
		
		System.out.println(driver.findElement(By.xpath("//div[@class='sc-fotOHu hmnmkS']/div[5]/div/p[1]")).getText());
		
		driver.quit();

	}

}
