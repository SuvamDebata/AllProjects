package selenium_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWebElements_Methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//int count = 1;
		Thread.sleep(1500);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for (int k = 0; k <= links.size() - 1; k++) {
			String linkText = links.get(k).getText();
			if (linkText.contentEquals("")) {

			} else {

				//links.get(k).click();
				System.out.println(linkText);
			}
		}

		driver.quit();
	}

}
