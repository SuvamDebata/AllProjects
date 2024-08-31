package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddLaptopToCartUsingXpathAncTechnique {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1500);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a)[64]")).click();
		driver.findElement(By.xpath("(//input)[6]")).click();
		driver.findElement(By.xpath("(//span)[2]")).click();

	}

}
