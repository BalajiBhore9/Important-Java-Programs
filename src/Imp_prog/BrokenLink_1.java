package Imp_prog;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink_1 {

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
			String urlLinks = E1.getAttribute("href");
			veryfylinks(urlLinks);
		}
		driver.quit();
	}
	public static void veryfylinks(String urlLinks) 
	{
		try {
			URL url = new URL(urlLinks);
			HttpURLConnection httpURLconnect = (HttpURLConnection)url.openConnection();
			httpURLconnect.setConnectTimeout(5000);
			httpURLconnect.connect();
			if(httpURLconnect.getResponseCode()>=400) 
			{
				System.out.println(urlLinks+" - "+httpURLconnect.getResponseMessage()+"is broken link");
			}
			else 
			{
				System.out.println(urlLinks+" - "+httpURLconnect.getResponseMessage());
			}
			
		}catch(Exception e) {
			
		}
	}

}
