package Imp_prog;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex1_Broken_links 
{
	@Test
	public void BrokenLinks() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\drivers\\chromedriver(98).exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("no of linsk: "+links.size());
		for(int i=0;i<links.size();i++)
		{
			WebElement E1 = links.get(i);
			String linkurl = E1.getAttribute("href");
			veryfylinks(linkurl);
		}
		driver.quit();
	}
	public void veryfylinks(String linkurl)
	{
		try 
		{
			URL url = new URL(linkurl);
			HttpURLConnection httpurlConnect = (HttpURLConnection)url.openConnection();
			httpurlConnect.setConnectTimeout(5000);
			httpurlConnect.getContent();
			if(httpurlConnect.getResponseCode()>=400)
			{
				System.out.println(linkurl+" - "+httpurlConnect.getResponseMessage()+ "is broken links");
			}
			else
			{
				System.out.println(linkurl+" - "+httpurlConnect.getResponseMessage());
			}
					
		}catch(Exception e) {			
		}
	}
}
