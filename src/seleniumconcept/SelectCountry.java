package seleniumconcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCountry {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.cssSelector("[placeholder='First Name']")).sendKeys("Ankita");
		
		driver.findElement(By.cssSelector("[placeholder='Last Name']")).sendKeys("Sankaye");
		
		driver.findElement(By.cssSelector("[ng-model='Adress']")).sendKeys("Anurag Colany ,Ambajogai");

		
		driver.findElement(By.cssSelector(".select2-selection__arrow")).click();
		
		
		driver.findElement(By.cssSelector(".select2-search__field")).click();
		
		
		Thread.sleep(5000);
		
	    List<WebElement> searchResult	= driver.findElements(By.xpath("//li[@class='select2-results__option']"));
	    

		  for(WebElement element : searchResult)
		{
			
			String elementTxt = element.getText();
			System.out.println(elementTxt);
		   if(elementTxt.contains("India"))
			{
				element.click();
				break;
				}
			
		}
	    

	}

}
