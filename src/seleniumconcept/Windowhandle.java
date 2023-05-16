package seleniumconcept;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("(//a['Open New Seperate Windows'])[39]")).click();
		
		String pwh = driver.getWindowHandle(); // alphanumaric id
		
		System.out.println(pwh);
		
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		for (String win : windows)
		{
			if(!win.equals(pwh))
			{
				driver.switchTo().window(win);
			}
		
		}
		
		driver.findElement(By.xpath("//span[text()='Projects']")).click();
		

	}

}
