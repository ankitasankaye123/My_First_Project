package seleniumconcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium ");
		
		
		Thread.sleep(5000);
	
	    List<WebElement> searchResult	= driver.findElements(By.xpath("//li[@class='sbct']"));
	    
	    // int numberOfElements = searchResult.size();
	   
	     //System.out.println(numberOfElements);
	   
	   
	    
	
	
	  for(WebElement element : searchResult)
	{
		
		String elementTxt = element.getText();
		System.out.println(elementTxt);
	   if(elementTxt.contains("selenium testing"))
		{
			element.click();
			break;
			}
		
	}
	}
}

	

