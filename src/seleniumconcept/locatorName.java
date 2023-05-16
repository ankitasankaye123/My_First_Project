package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorName {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("ankitasankaye@gmail.com");
		
		
		driver.findElement(By.name("pass")).sendKeys("Ankitasan123");
		
		driver.findElement(By.name("login")).click();

	}

}
