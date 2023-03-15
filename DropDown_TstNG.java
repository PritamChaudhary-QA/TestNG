package com.assignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class DropDown_TstNG {
	WebDriver d;
  @Test
  public void DropDown() 
  {
	 d.findElement(By.xpath("//*[@id=\'header\']/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/a")).click();
	 d.findElement(By.xpath("//*[@id=\'header\']/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/ul/li")).click();
	 d.findElement(By.xpath("//*[@id=\'header\']/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/ul/li/ul/li[2]/a")).click();
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
