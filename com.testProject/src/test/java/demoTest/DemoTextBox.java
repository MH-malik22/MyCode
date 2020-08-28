package demoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTextBox {
public static void main(String [] args)
{
	
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();

driver.get("https://demoqa.com/text-box");

//Enter Full Name :
driver.findElement(By.id("userName")).sendKeys("Rahul Dravid");

// Enter Email :
driver.findElement(By.id("userEmail")).sendKeys("mujamalik@aol.com");

// Enter Full Address :
driver.findElement(By.id("currentAddress")).sendKeys("8300 old courthouse road");

//Enter permanent address :
driver.findElement(By.id("permanentAddress")).sendKeys("8300 old courthouse road");

// Click on Submit Button :

driver.findElement(By.id("submit")).click();

//Navigate to Check box :

driver.findElement(By.xpath("//div[@class='element-list collapse show']/ul/li[2]")).click();


//click on Toggle button
driver.findElement(By.xpath("//button[@title='Toggle']")).click();

//click on Desktop checkbox
driver.findElement(By.className("rct-title")).click();


	
	
	
}
}
