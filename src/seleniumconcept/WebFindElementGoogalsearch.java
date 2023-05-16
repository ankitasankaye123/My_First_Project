package seleniumconcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebFindElementGoogalsearch {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		
		Thread.sleep(5000);
		
		List<WebElement> googleSearchResult =    driver.findElements(By.className("sbct"));
		
		//lopping statement
		
		int eleSize = googleSearchResult.size();
		
		System.out.println(eleSize);
		for(int i = 0; i<eleSize; i++)
		{
			String value = googleSearchResult.get(i).getText();
			
			System.out.println(value);
			
		}
		

	}

}
