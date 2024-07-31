package Imp_prog;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class scroll_till_the_bottom
{
	WebDriver driver;
	@Test
	public void scrollDown() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\drivers\\chromedriver(96).exe"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Launch the application
		driver.get("http://demo.guru99.com/test/guru99home/");
		//This will scroll the web page till end.
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
}
