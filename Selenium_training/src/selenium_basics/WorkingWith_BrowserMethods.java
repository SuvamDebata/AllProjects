package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWith_BrowserMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Launch A chrome driver
		// Create an object of Chrome Driver
		//ChromeDriver cdriver= new ChromeDriver();
		FirefoxDriver fdriver=new FirefoxDriver();
		//upcasting to webDriver
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.co.in");
		String title=driver.getTitle();
		String sourceUrl=driver.getCurrentUrl();
		String pagesource=driver.getPageSource();
		driver.manage().window().maximize();
		driver.close();
		System.out.println(title+" \n"+sourceUrl+" \n"+pagesource);
		
		fdriver.get("http://www.google.co.in");
		String ftitle=fdriver.getTitle();
		String fsourceUrl=fdriver.getCurrentUrl();
		String fpagesource=fdriver.getPageSource();
		fdriver.manage().window().maximize();
		fdriver.close();
		System.out.println(ftitle+" \n"+fsourceUrl+" \n"+fpagesource);
	}

}
