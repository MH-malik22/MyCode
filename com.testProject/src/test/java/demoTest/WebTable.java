package demoTest;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	
public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	

		driver.get("https://demoqa.com/webtables");
		// click on ADD button
		driver.findElement(By.id("addNewRecordButton")).click();

		// Add new Entry
		registrationForm("mike", "john", "test001@gmail.com", "36", "106990", "IT");
		// get number of rows
		int numberOfRowsAfterAddingValue = getNumberOfRows();
		System.out.println("Numbers of Rows After Adding value  --> " + numberOfRowsAfterAddingValue);

		driver.findElement(By.id("delete-record-4")).click();
		int NumberOfRowsAfterDeletingValue = getNumberOfRows();
		System.out.println("Numbers of Rows After Deleting value --> " + NumberOfRowsAfterDeletingValue);
		
		
		
			
		

	}
	
	
	
	public static void registrationForm(String firstName, String lastName,String email , String  age , String salary , String department)
	{
	driver.findElement(By.id("firstName")).sendKeys(firstName);
	driver.findElement(By.id("lastName")).sendKeys(lastName);
	driver.findElement(By.id("userEmail")).sendKeys(email);
	driver.findElement(By.id("age")).sendKeys(age);
	driver.findElement(By.id("salary")).sendKeys(salary);
	driver.findElement(By.id("department")).sendKeys(department);
	driver.findElement(By.id("submit")).click();
		
		
	}
	
	
	public static int getNumberOfRows() {
		
		List <WebElement> numberOfRows = driver.findElements(By.xpath("//div[@class='rt-tr-group']"));
		int count = 0 ;
		for(int i=1;i<=numberOfRows.size();i++) {
			
			
		String firstName = 	driver.findElement(By.xpath("//div[@class='rt-tr-group']["+i+"]//div[@class='rt-td'][1]")).getText();	
		
		if(!firstName.trim().equals(""))
		{
			
			count++;
			
		}
		else {
			break;
		}
			
			
		}
		return count;
		
		

		
		
		
		
		
		
		
		
	}
	
	
	

}
