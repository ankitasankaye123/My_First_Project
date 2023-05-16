package seleniumconcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementDropdown {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.cssSelector("[placeholder='First Name']")).sendKeys("Ankita");
		
		driver.findElement(By.cssSelector("[placeholder='Last Name']")).sendKeys("Sankaye");
		
		
		
		
		List <WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for (WebElement box : checkbox)
		{
			
			if(box.getAttribute("value").equals("Cricket") || box.getAttribute("value").equals("Hockey"))
			{
				box.click();
			}
			
			//static dropdown
			
			WebElement skillsDropDown = driver.findElement(By.id("Skills"));
			
			Select sel = new Select(skillsDropDown);
			
		    sel.selectByIndex(4);
			
			//sel.selectByValue(null);
			
			//sel.selectByVisibleText(null);
			
		
			//sel.selectByVisibleText("Java");
			
			 	}
	}



	}


