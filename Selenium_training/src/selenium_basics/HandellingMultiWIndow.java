package selenium_basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandellingMultiWIndow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1500);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demowebshop.tricentis.com/");
		String DemoWebShop = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Set<String> childwindows = driver.getWindowHandles();
		for(String window:childwindows)
		{
			driver.switchTo().window(window);
			if (driver.getTitle().contains("Facebook"))
				{
				driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("suvam@gmail.com");
				Thread.sleep(1500);
				driver.close();
				}
		}
		
		driver.switchTo().window(DemoWebShop);
		Thread.sleep(1500);
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		Thread.sleep(1500);
		driver.close();
		

	}

}
