package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorCSSSelector {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("ankita");
		
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Sanakye");
		

	}

}
