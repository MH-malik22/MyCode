package com.demo;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	
public static void main(String [] args) throws InterruptedException
{
 WebDriver driver;
 
 WebDriverManager.chromedriver().setup();
 driver = new ChromeDriver();
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 JavascriptExecutor js = (JavascriptExecutor) driver;
 driver.get("https://www.google.com");
 String title = driver.getTitle();
 System.out.println("Page Title -->"+title);
 driver.navigate().to("http://www.yahoo.com");
 try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//This  will scroll down the page by  1000 pixel vertical		
 js.executeScript("window.scrollBy(0,5000)");
 
 Thread.sleep(3000);
 
 driver.switchTo().alert().accept();
 
 
/** String currentURL = driver.getCurrentUrl();
 //System.out.println(currentURL);
// driver.navigate().back();

 



 By signInButton  = By.xpath("//*[@id='gb_70']");
 By email = By.id("identifierId");
 By nextButton = By.xpath("//*[@id=\"identifierNext\"]/div/button");
 
 
 
 
 driver.findElement(signInButton).click();
 driver.findElement(email).sendKeys("mujamalik22@gmail.com");
 driver.findElement(nextButton).click();
 
	 
 
// assertEquals("google", driver.getTitle());
 * 
 */
 
 
 
 
 
	
}

}
