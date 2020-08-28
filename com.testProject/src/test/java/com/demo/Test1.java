package com.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	static WebDriver driver;
	
public static void main (String [] args)
{
	



	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://way2automation.com/way2auto_jquery/frames-and-windows.php");
	//http://way2automation.com/way2auto_jquery/frames-and-windows.php
	//Alert alert = driver.switchTo().alert();
	//alert.accept();
	driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[1]/input")).sendKeys("test1");
	
	
	
//	Actions action = new Actions(driver);
 //   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[1]/div[1]/ul/li[3]/a"))).build().perform();
	
	
	
	
	
}
	
	
	
	
	
	
}
