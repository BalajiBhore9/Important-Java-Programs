package Imp_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Right_Click
{
	@Test
	public void rightclick() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\drivers\\chromedriver(96).exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		WebElement rightclick = driver.findElement(By.xpath("//input[@type='text']"));
		Actions ac = new Actions(driver);
		ac.contextClick(rightclick).perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
