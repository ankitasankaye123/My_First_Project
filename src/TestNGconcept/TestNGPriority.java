package TestNGconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGPriority {
	




	WebDriver driver;
	
	@BeforeMethod
	public void initilization()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https:\\www.google.com");
	}
	@Test (priority = -1)
	public void validateGoogleSearchTest()
	{
		driver.findElement(By.name("q")).sendKeys("TestNG");
	}
	@Test (priority = 2)
	public void validateGmailLinkTest()
	{
		boolean status = driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(status);
		
	}
	@Test ( enabled= false)
	public void validateGoogleLgoTest()
	{
		boolean logoStatus = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		System.out.println(logoStatus);
		
	}
	@Test (priority = 0)
	public void validateImageLinkTest()
	{
		boolean imagestatus = driver.findElement(By.linkText("Images")).isDisplayed();
		System.out.println(imagestatus);
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	
	

  
}
