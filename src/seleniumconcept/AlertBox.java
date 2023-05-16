package seleniumconcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//driver.findElement(By.cssSelector("[data-toggle='dropdown']")).getAttribute("href");
		

		driver.findElement(By.cssSelector(".btn.btn-danger")).click();
		
		
		
        Alert alt = driver.switchTo().alert();
		
		
		String alertText  = alt.getText();
		                    alt.accept();
		
		System.out.println(alertText);
		
		
		if (alertText.contains("Click button"))
		{
			System.out.println("test case is pass");
			
		}
		else
		{
			System.out.println("test case is fail");
		}
		
		
		
		
		}

}
