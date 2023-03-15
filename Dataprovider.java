package com.assignment;

import java.util.concurrent.TimeUnit;

import org.monte.screenrecorder.ScreenRecorderMain;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.ObjectArrays;



public class Dataprovider {
	WebDriver d;
	@DataProvider(name="logindata")
	 public static Object[][] credentials() 
	  {
		  return new Object [][]{  { "admin", "admin" },{"mngr482085","utasabA"},{"Pritu","Pritus"},{"gotya","Pintya"}};
	  }
  @Test(dataProvider ="logindata")
  public void login(String username, String password)
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\prita\\eclipse-workspace\\TestNG_Assignment\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("www.demo.guru99.com/V4/");
		d.manage().window().maximize();
		//d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.name("uid")).sendKeys(username);
		d.findElement(By.name("password")).sendKeys(password);
		d.findElement(By.name("btnLogin")).click();
  }
		
		/*Alert alt=d.switchTo().alert();
		alt.accept();
		//d.close();*/
		 
  }
