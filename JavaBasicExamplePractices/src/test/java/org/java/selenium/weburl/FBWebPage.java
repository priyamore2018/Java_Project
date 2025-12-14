package org.java.selenium.weburl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FBWebPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		try
		{
		     ChromeOptions options = new ChromeOptions();
		        options.addArguments("--headless=new");  // new headless mode
		        options.addArguments("--no-sandbox");    // avoids sandbox issues
		        options.addArguments("--disable-gpu");   // GPU acceleration issues
		        options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		Thread.sleep(1000);
		driver.get("https://www.fb.com/");
		driver.manage().deleteAllCookies();
		

		driver.manage().window().maximize();
		}
		catch(Exception e )
		{
			System.out.println(e);
		}
	}

}
