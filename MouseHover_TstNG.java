package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseHover_TstNG {
WebDriver d;
@Test
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

	
	d.close();
}
}
