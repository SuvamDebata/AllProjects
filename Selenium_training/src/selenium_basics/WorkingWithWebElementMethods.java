package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1500);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		Thread.sleep(1000);
		driver.findElement(By.id("small-searchterms")).clear();
		driver.findElement(By.id("small-searchterms")).sendKeys("Books");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		

}
}