package demoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo1 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		/**Sign Up */
		driver.findElement(By.name("name")).sendKeys("test2020");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("7033216539");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mujamalik22@gmail.com");
		Select select = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		select.selectByVisibleText("United States");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("lorton");
		driver.findElement(By.xpath("//form[@id='load_form']/fieldset[6]/input")).sendKeys("rockstar");
		driver.findElement(By.xpath("//form[@id='load_form']/fieldset[7]/input")).sendKeys("yoyo2020");
	    
	    driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/form/div/div[2]/input")).click();
	
	   /**Signin with exixting account */
       driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/form/div/div[1]")).click();

	}

}
