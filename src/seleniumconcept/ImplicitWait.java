package seleniumconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//implicit wait
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		//implicitlywait(Durationofsecond(50))
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		
		       driver.findElement(By.xpath("//button[text()='Remove']")).click();
				
				String msgText = driver.findElement(By.id("message")).getText();
				
				
				
				System.out.println(msgText);
				
				driver.findElement(By.xpath("//button[text()='Enable']")).click();
				

				String enableTxt = driver.findElement(By.xpath("//p[contains(text(),'It')]")).getText();
				System.out.println(enableTxt);
			

	}

}
