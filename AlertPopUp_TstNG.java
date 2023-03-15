package com.assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertPopUp_TstNG 
{
	WebDriver d;
	@Test
	public void AlertPopUp () throws InterruptedException 
	{
		 d.findElement(By.xpath("//*[@id=\'header\']/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/a")).click();
		 d.findElement(By.xpath("//*[@id=\'header\']/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/ul/li")).click();
		 d.findElement(By.xpath("//*[@id=\'header\']/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/ul/li/ul/li[2]/a")).click();
		 d.findElement(By.xpath("//*[@id=\'main\']/div[2]/div[1]/div/section[3]/div/div[2]/div/div/div/center/button")).click();
		  Alert alt=d.switchTo().alert();
		  alt.accept();
		 // alt.dismiss();
		  Thread.sleep(1000);
		  d.findElement(By.xpath("//*[@id=\'main\']/div[2]/div[1]/div/section[3]/div/div[3]/div/div/div/center/button")).click();
		 // alt.accept();
		  alt.dismiss();
		  
	}
	@BeforeMethod
	public void BrowserLuanch() 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\prita\\eclipse-workspace\\TestNG_Assignment\\Drivers\\chromedriver.exe");
		  d=new ChromeDriver();
		  d.get("https://nxtgenaiacademy.com/");
		  d.manage().window().maximize();
		
	}
	@AfterMethod
	public void BrowserClose() 
	{
		//d.close();
	}

}
