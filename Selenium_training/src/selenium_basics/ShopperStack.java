package selenium_basics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ShopperStack {
	
public static void main(String[] args) throws InterruptedException, IOException {
	
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.shoppersstack.com/user-signin");
	
	driver.manage().window().maximize();
	Thread.sleep(30000);
	WebElement we1 = driver.findElement(By.cssSelector("button[id='Create Account'] span[class='MuiButton-label']"));
//	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
//	wait.until(ExpectedConditions.elementToBeClickable(we));
	we1.click();
	driver.findElement(By.xpath("//input[@id='First Name']")).sendKeys("Shubham");
	driver.findElement(By.xpath("//input[@id='Last Name']")).sendKeys("Khosla");
	driver.findElement(By.xpath("//input[@id='Male']")).click();
	driver.findElement(By.xpath("//input[@id='Phone Number']")).sendKeys("9876543211");
	driver.findElement(By.xpath("//input[@id='Email Address']")).sendKeys("Shubham"+67+"@gmail.com");
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Shubh@123");
	driver.findElement(By.xpath("//input[@id='Confirm Password']")).sendKeys("Shubh@123");
	driver.findElement(By.xpath("//input[@id='Terms and Conditions']")).click();
	driver.findElement(By.xpath("//button[@id='btnDisabled']")).click();
	
	Thread.sleep(10000);
	
	TakesScreenshot ts =(TakesScreenshot)driver;
	//Temporary Location
	File scrfile=ts.getScreenshotAs(OutputType.FILE);
	//Destination File
	File destfile=new File("./Screenshots/"+"page.png");
	//Copy from temporary location to targeted location
	FileHandler.copy(scrfile, destfile);
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shubham58@gmail.com");
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Shubh@123");
	driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
	driver.findElement(By.xpath("//a[@id='men']")).click();
	driver.findElement(By.xpath("//div[@class='cat_box__jl5G7']//div[1]//div[3]//div[2]//button[1]")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[@id='cart']//*[name()='svg']")).click();
	driver.findElement(By.xpath("//button[@id='buynow_fl']")).click();
	driver.findElement(By.xpath("//input[@id='49382']")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@class='selectaddress_proceed__qiGsK']")).click();
	driver.findElement(By.xpath("//input[@value='COD']")).click();
	driver.findElement(By.xpath("//button[normalize-space()='Proceed']")).click();
	
	Thread.sleep(2000);
	
	WebElement we2 = driver.findElement(By.className("placeorder_checkoutcard__Y2L2o"));
	
	//Temporary Location
		File scrfile1=we2.getScreenshotAs(OutputType.FILE);
		//Destination File
		File destfile1=new File("./Screenshots/"+"OrderID.png");
		//Copy from temporary location to targeted location
		FileHandler.copy(scrfile1, destfile1);
	
	//driver.quit();
}
}
