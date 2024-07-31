package Imp_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTesting_TestNG 
{
	WebDriver driver ;
	@Test
	public void logoTest() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\drivers\\chromedriver(98).exe");
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		WebElement logo = driver.findElement(By.xpath("//img[@alt='OrangeHRM Inc Logo']"));
		Assert.assertTrue(logo.isDisplayed());
		Thread.sleep(2000);
	}
	@Test 
	public void homePageTittleTest() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\drivers\\chromedriver(98).exe");
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
		Thread.sleep(2000);
	}
	@AfterMethod
	public void logout()
	{
		driver.quit();
	}
}
