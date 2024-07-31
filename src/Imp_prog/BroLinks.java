package Imp_prog;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BroLinks {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\drivers\\chromedriver(96).exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("No of links is: "+links.size());
		for(int i=0;i<links.size();i++) 
		{
			WebElement E1 = links.get(i);
			String urllinks = E1.getAttribute("href");
			verfylinks(urllinks);
		}
		driver.quit();
	}
	public static void verfylinks(String urllinks) 
	{
		try 
		{
			URL url = new URL(urllinks);
			HttpURLConnection httpURLConnect = (HttpURLConnection)url.openConnection();
			httpURLConnect.setConnectTimeout(5000);
			httpURLConnect.connect();
			if(httpURLConnect.getResponseCode() >400) 
			{
				System.out.println(urllinks + " - "+httpURLConnect.getResponseMessage()+"is broken link");
			}
			else 
			{
				System.out.println(urllinks + " - "+httpURLConnect.getResponseMessage());
			}
			
		} catch (Exception e) {
			
		}
	}

}
