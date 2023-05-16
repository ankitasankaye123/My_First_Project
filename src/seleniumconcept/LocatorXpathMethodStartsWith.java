package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpathMethodStartsWith {

	public static void main(String[] args) {

		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
        driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();
        
        driver.findElement(By.xpath("//input[starts-with(@id,'u_')]")).sendKeys("Speedway");
        

	}

}
