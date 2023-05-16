package seleniumconcept;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if (title.contains("Log in")) {
			
			System.out.println("we are on facebook page");
		}
		
		//driver.getTitle();
		
		//driver.close();
		

	}

}
