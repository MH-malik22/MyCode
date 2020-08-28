package demoTest;


import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeletingEntryFromWebTable {

public static WebDriver driver ;

public static void main (String [] args)	
{
	
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get("https://demoqa.com/webtables");


	
getHeaderPosition();
	
	
	
	
}
	
	
public static void getHeaderPosition ()
{

List <WebElement> listOfHeaders = driver.findElements(By.xpath("//div[@class='rt-tr']/div"));

System.out.println(listOfHeaders.get(4).getText());


HashMap<String, Integer> headerPosition = new HashMap<String, Integer>();

int position = 1;
for (int i=0; i<listOfHeaders.size();i++)
{
	
  String headerText =  listOfHeaders.get(i).getText();	
	headerPosition.put(headerText, position);
	position++;
	
	
	
}
	
	System.out.println(headerPosition);
	
}
	
	
	
	
		
	
	
	
	
	
}
