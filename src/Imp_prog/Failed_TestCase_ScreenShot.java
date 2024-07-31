package Imp_prog;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Failed_TestCase_ScreenShot
{
	@Test
	public static void captureScreenShot() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\drivers\\chromedriver(98).exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try 
		{
			//Statement with incorrect Xpath
			driver.get("http://www.google.com");
			driver.navigate().refresh();
			driver.findElement(By.xpath("//*[@id='cse']")).sendKeys("agile"); 
		} catch (Exception e) 
		{
			File screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, new File("C:\\Users\\Admin\\OneDrive\\Desktop\\drivers\\ScreenShots\\failedtestcase.jpg"));
		}
		driver.close();
		driver.quit();
	}
}
