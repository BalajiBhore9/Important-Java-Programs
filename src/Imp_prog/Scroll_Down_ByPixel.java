package Imp_prog;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll_Down_ByPixel 
{
	WebDriver driver;
	@Test
	public void ByPixel() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\sel\\BrowserJarFile\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 // Launch the application
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		// This  will scroll down the page by  1000 pixel vertical
		js.executeScript("window.scrollBy(0,1000)");
	}
}
