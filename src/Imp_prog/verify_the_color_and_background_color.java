package Imp_prog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verify_the_color_and_background_color {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\drivers\\chromedriver(98).exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/index.htm");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		//getting color attribute with getCSSValue()
		String col = driver.findElement(By.xpath("//img[@alt='Coding Ground']")).getCssValue("color");
		//get baground color attribute with getCSSValue
		String bgcolor = driver.findElement(By.xpath("//*")).getCssValue("background color");
		System.out.println(col);
		System.out.println(bgcolor);
		Thread.sleep(2000);
		driver.quit();
	}

}
