package Imp_prog;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Ex2_FailedTestCase_ScreenShot 
{
	@Test
	public static void captureScreenShot() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\drivers\\chromedriver(98).exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try
		{
			driver.get("http:www.google.com");
			driver.navigate().refresh();
			driver.findElement(By.xpath("@id=12")).sendKeys("agile");	
		}
		catch(Exception e) 
		{
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\drivers\\ScreenShots\\failedtestcase1.jpg");
			FileHandler.copy(source, dest);
		}
		driver.close();
		driver.quit();
	}

}
