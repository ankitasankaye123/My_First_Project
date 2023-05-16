package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementRedioButton {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.cssSelector("[placeholder='First Name']")).sendKeys("Ankita");
		
		driver.findElement(By.cssSelector("[placeholder='Last Name']")).sendKeys("Sankaye");
		
		boolean rdoBtnStatus = driver.findElement(By.xpath("//input[@value='FeMale']")).isSelected();
		
		

		if(rdoBtnStatus==false)
		{
			driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		}
	}

}
