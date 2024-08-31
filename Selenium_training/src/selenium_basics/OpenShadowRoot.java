package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenShadowRoot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1500);
		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		SearchContext shadow_host = driver.findElement(By.xpath("(//div[@class='my-3'])[1]")).getShadowRoot();
		shadow_host.findElement(By.cssSelector("input[type='text']")).sendKeys("suvam");
		
	}

}
