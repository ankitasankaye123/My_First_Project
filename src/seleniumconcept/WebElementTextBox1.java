package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementTextBox1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.cssSelector("[placeholder='First Name']")).sendKeys("Ankita");
		
		//driver.findElement(By.cssSelector("[placeholder='First Name']")).clear();
		
		driver.findElement(By.id("submitbtn")).click();

	}

}
