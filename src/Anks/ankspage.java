package Anks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ankspage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver_win32 (1)\"");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.id("email")).sendKeys("Ankita");
		
		driver.findElement(By.name("pass")).sendKeys("Ankita@12");

	}

	
	
		
	}

	
	
