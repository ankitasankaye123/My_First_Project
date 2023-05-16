package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDroppAndDrop {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		WebElement source = driver.findElement(By.cssSelector("#draggable"));
		
		WebElement destination = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
	//	act.clickAndHold(source)
		//.release(destination)
		//.build()
		//.perform();
		
		act.dragAndDrop (source, destination).build().perform();

	}

}
