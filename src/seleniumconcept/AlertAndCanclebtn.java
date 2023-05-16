package seleniumconcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndCanclebtn {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();

		
	    Alert alt= 	driver.switchTo().alert();
		
	    
		String alertText = alt.getText();
		
		
		
		//alt.accept();// it will click on button
		
		alt.dismiss();//it will click on cancel button
		
		System.out.println(alertText);
		
		
		String labelText = driver.findElement(By.id("demo")).getText();
		
		if(labelText.contains("OK"))
		{
			System.out.println("we clicked on OK button");
		}
		
		else {
			System.out.println("we clicked on cancel button");
		}
		
	}
	
	

}
