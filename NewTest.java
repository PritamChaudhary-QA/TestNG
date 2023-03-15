 package com.testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver d;
  @Test
  public void f() throws InterruptedException, IOException 
  {
	//take path of accept all cooking
			d.findElement(By.xpath("//*[@id='cookie-root']/div[2]/div/div/button[1]")).click();
			//take path of source element
			d.findElement(By.id("src")).click();
			//to send input text
			d.findElement(By.id("src")).sendKeys("Ban");
			for(int i=1;i<=4;i++)
			{
				//to navigate required option press down keys
			d.findElement(By.id("src")).sendKeys(Keys.DOWN);
			Thread.sleep(1000);
			}
			//to select option press enter key
			d.findElement(By.id("src")).sendKeys(Keys.ENTER);
			//to take screenshot for executed functionality
			//convert web driver object to takescreenshot
			Thread.sleep(1000);
			TakesScreenshot scrshot=((TakesScreenshot)d);
			//call getscreenshot method to create image file
			File srcfile=scrshot.getScreenshotAs(OutputType.FILE);
			//create new file in any drive of computer and pass location of that file
			File destfile=new File("D:\\New folder\\samplepic2.jpg");
			//fileutils of apachecommon io to copy src file to dest file
			FileUtils.copyFile(srcfile, destfile);
  }
  @BeforeMethod
  public void Login() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\prita\\eclipse-workspace\\Webdriver_Selenium\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		//open URL
		d.get("https://www.redbus.com/");
		d.manage().window().maximize();
  }
  @AfterMethod
  public void close() 
  {
	  d.close();
  }
}

