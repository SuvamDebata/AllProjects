package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dream11.com/");
		Thread.sleep(1500);
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.id("send-sms-iframe")));
		driver.findElement(By.id("regEmail")).sendKeys("9040127075");

	}

}
