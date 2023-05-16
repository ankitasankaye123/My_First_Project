package seleniumconcept;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
	

	}

}
