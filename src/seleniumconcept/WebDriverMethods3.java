package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[2]/a")).click();

	}

}
