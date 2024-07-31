package Imp_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollDown_the_web_page_by_the_visibility_element 
{
	WebDriver driver;
	@Test
	public void ByPixel() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\drivers\\chromedriver(96).exe"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Launch the application
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		//Find element by link text and store in variable "Element" 
		WebElement Element = driver.findElement(By.linkText("Linux"));
		
		//This will scroll the page till the element is found
		js.executeScript("arguments[0].scrollIntoView()",Element);
	}
}
