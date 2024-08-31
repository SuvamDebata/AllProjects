package selenium_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithSelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1500);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Books")).click();
		Thread.sleep(1000);
		WebElement cata = driver.findElement(By.id("products-orderby"));
		Select cataObj=new Select(cata);
		cataObj.selectByVisibleText("Price: Low to High");
		WebElement cata1= driver.findElement(By.id("products-orderby"));
		Select cataObj1=new Select(cata1);
		List<WebElement> allsel = cataObj1.getAllSelectedOptions();
				for(WebElement element: allsel)
		{
			System.out.println(element.getText());
		}
//		
		
		
		


	}

}
