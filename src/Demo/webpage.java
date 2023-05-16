package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webpage {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");
   
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		
		 

	}
	

}
