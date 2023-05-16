package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorRelativeXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("ankita");
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Sanakye");
		
		driver.findElement(By.cssSelector("[ng-model='Adress']")).sendKeys("Anurag Colany ,Ambajogai");

	}

}
