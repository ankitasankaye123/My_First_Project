package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorCSSSelector2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
        driver.get("https://classic.freecrm.com/index.html");
		
        driver.findElement(By.cssSelector(".form-control")).sendKeys("Ankita123");
		
		driver.findElement(By.cssSelector("[plceholder='password']")).sendKeys("Ankita@123");
		
		driver.findElement(By.cssSelector(".btn.btn-small")).click();
		
		
	}

}
