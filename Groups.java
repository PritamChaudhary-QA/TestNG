package com.assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Groups {
	WebDriver d;
  @Test (groups={"DropDown"})
  public void DropDown() 
  {
	  	 d.findElement(By.xpath("//*[@id=\'header\']/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/a")).click();
		 d.findElement(By.xpath("//*[@id=\'header\']/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/ul/li")).click();
		 d.findElement(By.xpath("//*[@id=\'header\']/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/ul/li/ul/li[2]/a")).click();
	 	 System.out.println("Dropdown test Groups"); 
  }
  @Test  (groups={"AlertPopUp"})
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
		  System.out.println("AlertPopUp test Groups"); 
 }
  @Test (groups={"MouseHover"})
  public void MouseHover () 
  {
  	//WebElement Demo_Site=
  			d.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]")).click();
  	//WebElement Prac_Auto=
  			d.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/ul/li")).click();
  	//WebElement Mous_Ev=
  			d.findElement(By.xpath("//*[@id=\'header\']/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/ul/li/ul/li[5]/a")).click();
  	WebElement DoubleClick=d.findElement(By.xpath("//*[@id=\'dblclick\']"));
  	WebElement RighClk=d.findElement(By.id("rightclick"));
  	Actions a=new Actions(d);
  	//a.moveToElement(Demo_Site).build().perform();
  	//a.moveToElement(Prac_Auto).build().perform();
  	//a.moveToElement(Mous_Ev).build().perform();
  	a.doubleClick(DoubleClick).build().perform();
  	a.contextClick(RighClk).perform();	
  	System.out.println("MouseHOver test Groups"); 
  }
  
  @BeforeMethod (groups={"BrowserLaunch"})
  public void BrowserLuanch() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\prita\\eclipse-workspace\\TestNG_Assignment\\Drivers\\chromedriver.exe");
	  d=new ChromeDriver();
	  d.get("https://nxtgenaiacademy.com/");
	  d.manage().window().maximize();
  }

  @AfterMethod (groups={"BrowserClose"})
  public void BrowserClose() 
  {
	 //d.close();
  }
  
}
