package selenium_basics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		//type cast to get the capablities of takescreenshot interface to driver instance
		//typecasting
		TakesScreenshot ts =(TakesScreenshot)driver;
		//Temporary Location
		File scrfile=ts.getScreenshotAs(OutputType.FILE);
		//Destination File
		File destfile=new File("./ScreenShots/HomePage.png");
		//Copy from temporary location to targeted location
		FileHandler.copy(scrfile, destfile);
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		File scr=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/SearchPage.png");
		FileHandler.copy(scr, dest);
		driver.close();

	}

}
