package seleniumconcept;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementAlert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://register.rediff.com/register/register.php?FormName");
		
		driver.findElement(By.xpath("//input[starts-with(@name,'Register')]")).click();
		
		
     //direct handle
		
		
	   // driver.switchTo().alert().accept();
	    
	    
		
		//we can store that object in variable and perform actions
		
		Alert alt = driver.switchTo().alert();
		
		
		String alertText  = alt.getText();
		
		System.out.println(alertText);
		
		
		if (alertText.contains("Your full name cannot be blank"))
		{
			System.out.println("test case is pass");
			
		}
		else
		{
			System.out.println("test case is fail");
		}
		
	}

}
