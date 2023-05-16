package seleniumconcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementTextBox {


	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.cssSelector("[placeholder='First Name']")).sendKeys("Ankita");
		
		driver.findElement(By.cssSelector("[placeholder='Last Name']")).sendKeys("Sankaye");
		
		driver.findElement(By.cssSelector("[ng-model='Adress']")).sendKeys("Anurag Colany ,Ambajogai");

		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input")).sendKeys("ankitasankaye15@gmail.com");

	//	driver.findElement(By.cssSelector("[ng-model='Adress']")).sendKeys("Anurag Colany ,Ambajogai");
		
		
		driver.findElement(By.cssSelector("[ng-model='Phone']")).sendKeys("8624958852");
		
		
		
	    boolean rdoBtnStatus =driver.findElement(By.xpath("//input[@value='FeMale']")).isSelected();
		
		

		if(rdoBtnStatus==false)
		{
			driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		}
		

		//driver.findElement(By.id("checkbox1")).click();
		
		driver.findElement(By.id("checkbox2")).click();
		
		List <WebElement>  checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement box :checkbox)
		{
			if(box.getAttribute("value").equals("Cricket"))
			
			box.click();
			}
		
		
		
		
		//WebElement skillDropDown = driver.findElement(By.id("msdd"));
		
		//Div sel0 = new Div(skillDropDown);
		
	   
		//sel0.selectByValue("English");
		

		
		
		//Skills
		
		WebElement skillsDropDown = driver.findElement(By.id("Skills"));
		
		Select sel = new Select(skillsDropDown);
		
	   
		sel.selectByValue("Java");
		
	
		//india
		
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
		
		
		
		
		
		
		
		//Dateof Birth
		
            WebElement DateDropDown = driver.findElement(By.id("yearbox"));
		
		    Select Date1 = new Select(DateDropDown);
		
	  
		    Date1.selectByValue("1998");
		    
		    
		    WebElement DateofBirthDropDown = driver.findElement(By.cssSelector("[placeholder='Month']"));
			
		    Select Date2 = new Select(DateofBirthDropDown);
		
	  
		    Date2.selectByValue("January");
		
		
		    
		    
            WebElement DateofyearDropDown = driver.findElement(By.cssSelector("[placeholder='Day']"));
			
		    Select Date3 = new Select(DateofyearDropDown);
		
	  
		    Date3.selectByValue("6");
		
		    
		
		
		
		driver.findElement(By.cssSelector("#firstpassword")).sendKeys("Sankaye123");
				
		driver.findElement(By.cssSelector("#secondpassword")).sendKeys("Sankaye123");
		
		driver.findElement(By.cssSelector("#submitbtn")).click();
		
		
		
		
		
		
		}
	
	
				
	}
	


