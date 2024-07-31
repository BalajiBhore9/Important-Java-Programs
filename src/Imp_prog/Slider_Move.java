package Imp_prog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_Move {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\drivers\\chromedriver(96).exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/resources/demos/slider/default.html");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		Actions ac = new Actions(driver);
		// move to right side
		//action.dragAndDropBy(source, xOffset, yOffset).perform();
		//xOffset horizontal move offset.
		//yOffset vertical move offset.
		ac.dragAndDropBy(slider, 200,0).perform();
		Thread.sleep(2000);
		//move to left side 
		ac.dragAndDropBy(slider, -100,0).perform();
	}
}
