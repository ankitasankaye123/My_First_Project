package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementFrame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		//driver.switchTo().frame("SingleFrame");  //name use 

		WebElement frameElement  = driver.findElement(By.id("singleframe"));
		
		driver.switchTo().frame(frameElement);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Sppedway");
		
		//driver.findElement(By.partialLinkText())
	}

}
