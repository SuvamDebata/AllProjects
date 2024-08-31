package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorAutomationExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch chrome browser
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1500);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//Navigate to the url
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		//Click on Register Link
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(1000);
		
		//Enter the details in register Page
		//click on male radio in Gender webElement
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(1000);
		
		//Enter text in First name field
		driver.findElement(By.id("FirstName")).sendKeys("Ryan");
		Thread.sleep(1000);
		
		//Enter text in Last name field
		driver.findElement(By.id("LastName")).sendKeys("DGameStar");
		Thread.sleep(1000);
		
		//Enter text in Email Field
		driver.findElement(By.id("Email")).sendKeys("DGameStar@gmail.com");
		Thread.sleep(1000);
		
		//Enter text in Password field
		driver.findElement(By.id("Password")).sendKeys("Ryan@123");
		Thread.sleep(1000);
		
		//Enter text in Confirm Password field
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Ryan@123");
		Thread.sleep(1000);
		
		//Click on Register Button
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		
		//Close The window
		driver.close();
		
		
		
	}

}
