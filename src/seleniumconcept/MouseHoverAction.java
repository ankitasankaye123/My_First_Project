package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Speedway2016");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Speedway@2016");
		
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.switchTo().frame("mainpanel");
		
		
	    WebElement contacts = 	driver.findElement(By.xpath("//a[@title='Contacts']"));
		
	
	    Actions act = new Actions(driver);
	    
	    act.moveToElement(contacts).build().perform();
		
		driver.findElement(By.linkText("New Contact")).click();

	}

}
