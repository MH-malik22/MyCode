package demoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	public static void main (String [] args)
	{
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://demoqa.com/buttons");
		
		Actions action = new Actions(driver);
		action.doubleClick(driver.findElement(By.id("doubleClickBtn"))).perform();
		
		action.contextClick(driver.findElement(By.id("rightClickBtn"))).perform();
		
		driver.findElement(By.xpath("//div[@class='col-12 mt-4 col-md-6']/div[1]/div[3]/button")).click();
		
		
		
	}
	
	
	
	
}
