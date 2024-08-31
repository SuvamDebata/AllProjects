package selenium_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAllRadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1500);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> links = driver.findElements(By.xpath("//input[@type='radio']"));
		for (WebElement radio_button : links) {
			Thread.sleep(1000);
			radio_button.click();
			System.out.println(radio_button.isSelected());

		}
		
		  List<WebElement> textSpace = driver.findElements(By.xpath("//input[@type='text']"));
		   for(WebElement enterText:textSpace) 
		  { 
			   Thread.sleep(1000);
			   enterText.sendKeys("Suvam");
			  // System.out.println(enterText.isDisplayed());
			   System.out.println(enterText.getAttribute("value"));
		  
		  }
		 
		/*
		 * WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
		 * element.sendKeys("suvam"); System.out.println(element.getAttribute("value"));
		 */
	}

}
