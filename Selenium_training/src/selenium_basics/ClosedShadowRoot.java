package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClosedShadowRoot {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1500);
		driver.get("https://demoapps.qspiders.com/ui/shadow/closed?sublist=1");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//h1[text()='Login']")).click();
		Actions action=new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys("Suvam");
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys("Debata").perform();
		
	}
}
	
