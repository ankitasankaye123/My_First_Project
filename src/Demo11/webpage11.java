package Demo11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webpage11 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.facebook.com/");
		 
		 WebElement e1=driver.findElement(By.id("email"));
		 e1.sendKeys("Ankita Sankaye");
		 WebElement e2=driver.findElement(By.name("pass"));
		 e2.sendKeys("Ankita@125");
		 
		
		

	}

}
