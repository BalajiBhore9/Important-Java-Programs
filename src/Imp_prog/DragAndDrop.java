package Imp_prog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop 
{
	@Test
	public void draganddrop()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\drivers\\chromedriver(96).exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/guru99home/");
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement desti = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));
		Actions act = new Actions(driver);
		act.moveToElement(desti).clickAndHold().moveToElement(desti).dragAndDrop(source, desti).release().build().perform();
	}

}
