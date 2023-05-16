package seleniumconcept;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		String pageData = driver.getPageSource();
		
		System.out.println(pageData);

	}

}
