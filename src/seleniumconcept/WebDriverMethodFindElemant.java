package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodFindElemant {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/index.html");
		
		driver.findElement(By.className("form-control")).sendKeys("Ankita");
		
		driver.findElement(By.name("password")).sendKeys("Ankita@1234");
		
		
		
		
		

	}

}
