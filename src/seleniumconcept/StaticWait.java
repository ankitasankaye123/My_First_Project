package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWait {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		
		driver.findElement(By.xpath("//button[text()='Remove']")).click();
		//1sec
		//2sec
		//3sec
		Thread.sleep(5000);
		
		String msgText = driver.findElement(By.id("message")).getText();
		
		System.out.println(msgText);
		
		
		
		driver.findElement(By.xpath("//button[text()='Enable']")).click();
		
		Thread.sleep(5000);
		String enableTxt = driver.findElement(By.xpath("//p[contains(text(),'It')]")).getText();
		System.out.println(enableTxt);
	
	}

}
