package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	WebDriver d;
  @Test
  @Parameters ({"username","password"})

  public void login(String username, String password) 
  {
	  for(int i=1;i<=4;i++)
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\prita\\eclipse-workspace\\TestNG\\Drivers\\chromedriver.exe");
		  d=new ChromeDriver();
		  d.get("http://127.0.0.1/orangehrm-2.6/login.php");
		  d.findElement(By.name("txtUserName")).sendKeys("admin");
		  d.findElement(By.name("txtPassword")).sendKeys("admin");
		  d.findElement(By.name("Submit")).click();
	  }
		  
  }
}
