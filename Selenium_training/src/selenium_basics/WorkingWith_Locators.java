package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWith_Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launch the browser
		WebDriver driver=new ChromeDriver();
		//navigate to url
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(1500);
		driver.manage().window().maximize();
		//name LOCATOR
		//enter the text in the searchfield
		//WebElement searchfield=driver.findElement(By.name("q"));
		//Thread.sleep(1500);
		//searchfield.sendKeys("mobile");
		/*driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();*/
		
		//id LOCATOR
		//driver.findElement(By.id("small-searchterms")).sendKeys("mobile");
		
		//LinkText LOCATOR
		//Click on Register link
		//driver.findElement(By.linkText("Register")).click();
		//Click on login link
		//driver.findElement(By.linkText("Log in")).click();
		
		//PartialLinkText LOCATOR
		//Click on Shopping cart Link
		//driver.findElement(By.partialLinkText("hoppin")).click();
		
		//tagName LOCATOR
		//enter text in Subscribe text field
		driver.findElement(By.tagName("input")).sendKeys("test@123.com");

	}

}
