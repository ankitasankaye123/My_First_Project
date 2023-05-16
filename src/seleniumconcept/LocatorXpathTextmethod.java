package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpathTextmethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
       String data =  driver.findElement(By.xpath("//h2[text()='Register']")).getText();
        
        System.out.println(data);

        
        if (data.contains("Register"))
        {
        	System.out.println("We are redirected on register page");
        	
        }
      
        
	}

}


