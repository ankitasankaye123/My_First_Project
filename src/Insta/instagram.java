package Insta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("usarname")).sendKeys("Ankita");
		
		driver.findElement(By.name("password")).sendKeys("Ankita@12");

	

	}

}
