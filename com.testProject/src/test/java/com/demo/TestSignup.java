package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	/** SignUp**/
	driver.get("https://accounts.lambdatest.com/register");
	driver.findElement(By.xpath("//input[starts-with(@placeholder,'Full')]")).sendKeys("learn automation");
	driver.findElement(By.name("email")).sendKeys("mujamalik@aol.com");
	driver.findElement(By.id("userpassword")).sendKeys("welcome@2020");
	driver.findElement(By.cssSelector("input[placeholder='Company Name']")).sendKeys("shining star");
	driver.findElement(By.xpath("//input[@type='phone']")).sendKeys("7037770000");
	driver.findElement(By.xpath("//button[contains(@class,'-dark')]")).click();
	
	
	
	/** validate the user is not able to sign up again with the same email and error message is displayed.
    WebElement titletext = 	driver.findElement(By.xpath("//p[@class='error-mass']"));
    System.out.println(titletext.getText());
	Assert.assertEquals(titletext.getText(), "Tis email is already registered");
	**/
		
	}

}
