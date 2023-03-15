package com.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.ObjectArrays;

public class Data_Provider {
	WebDriver d;
  @DataProvider(name="logindata")
  public static Object[][] credentials() //Array Object return type
  //dataprovider method should be always return type
  {
	  return new Object [][]{  {"admin","admin"},{"admin","shreya"},{"admin","shital"},{"tops","shreya"}  };
  }
 // @DataProvider(name="dropdowndata")
  @Test(dataProvider="logindata")
  public void login(String username,String password) 
	{
	  	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prita\\eclipse-workspace\\TestNG_Assignment\\Drivers\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("http://127.0.0.1/orangehrm-2.6/login.php");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.findElement(By.name("txtUserName")).sendKeys(username);  //2 sec--8 sec save
		d.findElement(By.name("txtPassword")).sendKeys(password);  //6 sec---4sec sav
		d.findElement(By.name("Submit")).click(); 
		d.close();
	}

  
}
