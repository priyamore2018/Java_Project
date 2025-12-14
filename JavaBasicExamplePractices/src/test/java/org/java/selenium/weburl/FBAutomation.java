package org.java.selenium.weburl;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FBAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-features=PrivacySandboxSettings4");
		options.addArguments("--disable-popup-blocking");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.fb.com/");
		driver.manage().deleteAllCookies();
		

		driver.manage().window().maximize();
		
		//Allow all cookies
		//xpath with finding element with text name. //*[text()='element name'] or // tagname[text()='element name’]
		//driver.findElement(By.xpath("//span[text()='Allow all cookies']")).click();
		driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[3]/div[2]/div/div/div/div/div[3]/div[2]/div/div[2]/div[1]/div/div[1]")).click();
		
		//  //*[@id="facebook"]/body/div[3]/div[2]/div/div/div/div/div[3]/div[2]/div/div[2]/div[1]/div/div[1]
		Thread.sleep(1000);
		
	
		//Create new account
		//Link Text
		driver.findElement(By.linkText("Create new account")).click();
		
		//First name
		//xpath with //Tagname[@attribute=’value’]
		WebElement firstName= driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("Priyanka");
		
		//Last Name
		//XPath with //Tagname[@attribute=’value’] --> //input[@name='lastname']
		//xpath with contains : //tagname[contains(@class,'value')]
								//input[contains(@name,'lastname')]
		WebElement lastName= driver.findElement(By.xpath("//input[contains(@name,'lastname')]"));
		lastName.sendKeys("More");
		
		//Birthday
		
		Select dropDownMonth=new Select(driver.findElement(By.id("month")));
		
		dropDownMonth.selectByVisibleText("Jun");
		
		

		//Birthday
		Select dropDownDay=new Select(driver.findElement(By.id("day")));
		
		dropDownDay.selectByVisibleText("1");
		
		
		Select dropDownYear=new Select(driver.findElement(By.id("year")));
		
		dropDownYear.selectByValue("1950");
		
		//gender
		WebElement genderSelection= driver.findElement(By.xpath("//label[text()='Female']"));
		genderSelection.click();
		
		
		//mobile number
		// cssSelector with Tagname[attribute*='first 4 chars of value']
		WebElement mobileNumber=driver.findElement(By.cssSelector("input[aria-label*='Mobi']"));
		mobileNumber.sendKeys("23232434242");
		
		//password
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("dasdsaddda");
		
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
