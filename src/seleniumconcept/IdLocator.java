package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Index.html");
		
	   WebElement skipSignBtn =	driver.findElement(By.id("email"));
	   
	   skipSignBtn.sendKeys("ankitasankaye@gmail.com");
		

	}
}