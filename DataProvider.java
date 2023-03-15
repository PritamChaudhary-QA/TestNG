package com.testng;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataProvider {
	WebDriver d;
  @Test(dataProvider = "logindata")
  public void f(String username, String password) {
  
  	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prita\\eclipse-workspace\\TestNG_Assignment\\Drivers\\chromedriver.exe");
	d=new ChromeDriver();
	d.get("https://www.demo.guru99.com/V4/");
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	d.findElement(By.name("uid")).sendKeys(username);
	d.findElement(By.name("password")).sendKeys(password);
	d.findElement(By.name("btnLogin")).click();
	/*Alert alt=d.switchTo().alert();
	alt.accept();*/
	d.close();
  }
	@org.testng.annotations.DataProvider(name="logindata")
  public static Object[][] credentialObjects()
	{
    return new Object[][] 
    		{
      new Object[] { "admin", "admin" },{"mngr482085","utasabA"},{"Pritu","Pritus"},{"gotya","Pintya"}};
  }
}
