package seleniumconcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocaterTagName {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(5000);
		
		
		// broken links
		
		//int linkTotal = driver.findElement(By.tagName("a")).size();
		
		//System.out.println("linkTotal");
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		
		int linkTotal = links.size();
		
		System.out.println(linkTotal);
		
		for (int i = 0; i<linkTotal;i++)
		{
			//links.get(i).getText();
			
			String linkTxt = links.get(i).getAttribute("href");

			System.out.println(linkTxt);
			
		}
		
		
	}
	

}
