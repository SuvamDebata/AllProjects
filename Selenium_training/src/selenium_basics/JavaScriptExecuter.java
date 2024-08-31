package selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1500);
		//TypeCasting of java Script Executor with driver instance
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement searchfield = driver.findElement(By.id("small-searchterms"));
		WebElement searchbutton = driver.findElement(By.xpath("//input[@type='submit']"));
		WebElement subscribeTxfld = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		js.executeScript("arguments[0].value='mobile';", searchfield);
		Thread.sleep(1500);
		js.executeScript("arguments[0].value='suvam@g.co';", subscribeTxfld);
		Thread.sleep(1500);
		js.executeScript("arguments[0].click();", searchbutton);
		
	}

}
