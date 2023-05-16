package seleniumconcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCheckBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.cssSelector("[placeholder='First Name']")).sendKeys("Ankita");
		
		driver.findElement(By.cssSelector("[placeholder='Last Name']")).sendKeys("Sankaye");
		
		driver.findElement(By.xpath("//input[@value='FeMale']")).isSelected();
		
		//checkBox
		
		//driver.findElement(By.id("checkbox1")).click();
		
		//driver.findElement(By.id("checkbox2")).click();
		
		//driver.findElement(By.id("checkbox3")).click();
		
		
		List <WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for (WebElement box : checkbox)
		{
			
			if(box.getAttribute("value").equals("Cricket") || box.getAttribute("value").equals("Hockey"))
			{
				box.click();
			}
			
		}
	}

}
