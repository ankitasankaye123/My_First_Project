package seleniumconcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertwithtextbox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		
		driver.findElement(By.cssSelector(".btn.btn-info")).click();
		
		Alert alt = driver.switchTo().alert();
		
		alt.sendKeys("SpeedWay");
		alt.accept();

		
	}

}
