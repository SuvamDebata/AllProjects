package selenium_basics;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithActionClass_DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1500);
		driver.get("https://www.dhtmlgoodies.com/script/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		/*
		 * WebElement source=driver.findElement(By.id("box3")); WebElement
		 * targer=driver.findElement(By.id("box103"));
		 */
		action.dragAndDrop(driver.findElement(By.id("box3")), driver.findElement(By.id("box103"))).build().perform();
		action.clickAndHold(driver.findElement(By.id("box3"))).moveToElement(driver.findElement(By.id("box103"))).build().perform();
	
	}

}
