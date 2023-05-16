package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginandLogout {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Speedway2016");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Speedway@2016");
		
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(1000); 
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("(//a[@class='topnavlink'])[3]")).click();
		

	}

}
