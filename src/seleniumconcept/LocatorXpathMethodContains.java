package seleniumconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpathMethodContains {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
       String data =  driver.findElement(By.xpath("//label[contains(text(),'Email')]")).getText();
        
        System.out.println(data);

        
        
       // driver.findElement(By.xpath("//a[contain(@id,'u_0')]")).click();  //facebook page link add krun id xapth ghetla ahe
        

	}

}
