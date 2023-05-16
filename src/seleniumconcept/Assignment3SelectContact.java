package seleniumconcept;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment3SelectContact {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chromedriver", "\"C:\\Users\\home\\Downloads\\chromedriver.exe\"");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Speedway2016");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Speedway@2016");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.switchTo().frame("mainpanel");
		
	    WebElement contacts = 	driver.findElement(By.xpath("//a[@title='Contacts']"));
	
	    Actions act = new Actions(driver);
	    
	    act.moveToElement(contacts).build().perform();
		
		driver.findElement(By.linkText("New Contact")).click();
		
       // driver.findElement(By.className("select")).click();
		   
		  WebElement Title = driver.findElement(By.name("title"));
		  Select sel = new Select(Title);
			sel.selectByVisibleText("Miss");
			
			
		   
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Ankita");
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Ramling");
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Sankaye");
		
		driver.findElement(By.xpath("//input[@value='Lookup']")).click();
		//driver.switchTo().Window(win).getWindowHandles();
		String pwh = driver.getWindowHandle();
		Set<String> Windows = driver.getWindowHandles();
		for(String win:Windows)
		{
			if(!win.equals(pwh))
					{
				
				driver.switchTo().window(win);
					}
		}
		
		driver.findElement(By.cssSelector("#search")).sendKeys("Infosys");
		
		
		
		
		
	//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("info");
		
	     driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	     driver.findElement(By.linkText("Infosys")).click();    
	         
	     driver.switchTo().window(pwh);
	     driver.switchTo().frame("mainpanel");
	     
	     // position
	     
	     
	     driver.findElement(By.xpath("//input[@name='company_position']")).sendKeys("software Testing");
	     
	     driver.findElement(By.xpath("//input[@name='department']")).sendKeys("Testing");
	 //
	     
	     
	     
	    
	 	driver.findElement(By.xpath("(//input[@value='Lookup'])[2]")).click();
	 	
	 	String pwh1 = driver.getWindowHandle();
		Set<String> Windows1 = driver.getWindowHandles();
		for(String win:Windows1)
		{
			if(!win.equals(pwh1))
					{
				
				driver.switchTo().window(win);
					}
		}
		
		driver.findElement(By.cssSelector("#search")).sendKeys(" Sujeet sir");
	     
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
			
	     driver.findElement(By.xpath("//a['Sujeet sir']")).click();    
	         
	     driver.switchTo().window(pwh1);
	     driver.switchTo().frame("mainpanel");
	     
	     
	     
	     
	     //
	     
	 	driver.findElement(By.xpath("(//input[@value='Lookup'])[3]")).click();
	     
	 	String pwh2 = driver.getWindowHandle();
		Set<String> Windows2 = driver.getWindowHandles();
		for(String win:Windows2)
		{
			if(!win.equals(pwh2))
					{
				
				driver.switchTo().window(win);
					}
		}
		
		driver.findElement(By.cssSelector("#search")).sendKeys(" Ankita Sankaye");
	     
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
			
	     driver.findElement(By.xpath("//a['Ankita Sankaye']")).click();    
	         
	     driver.switchTo().window(pwh2);
	     driver.switchTo().frame("mainpanel");
	     
	     
	     
	     //
	     
	     
	     driver.findElement(By.xpath("(//input[@value='Lookup'])[4]")).click();
	     
		 	String pwh3 = driver.getWindowHandle();
			Set<String> Windows3 = driver.getWindowHandles();
			for(String win:Windows3)
			{
				if(!win.equals(pwh3))
						{
					
					driver.switchTo().window(win);
						}
			}
			
			driver.findElement(By.cssSelector("#search")).sendKeys(" Miss Deepali");
		     
			 driver.findElement(By.xpath("//input[@type='submit']")).click();
				
		     driver.findElement(By.xpath("//a['Miss Deepali']")).click();    
		         
		     driver.switchTo().window(pwh3);
		     driver.switchTo().frame("mainpanel");
		     
	     
	     
	     //select category
		     
		    WebElement Cat =  driver.findElement(By.xpath("//select[@name='category']"));     
		    Select sel2 = new Select(Cat);
		    sel2.selectByVisibleText("Friend");
		    
		    // select status
		    WebElement Set =  driver.findElement(By.xpath("//select[@name='status']"));     
		    Select Sel3 = new Select(Set);
		    Sel3.selectByVisibleText("New");
		    
		    
		    driver.findElement(By.id("phone")).sendKeys("9850799194");
		    driver.findElement(By.id("mobile")).sendKeys("8624958852");
		    driver.findElement(By.id("home_phone")).sendKeys("124-55630");
		    driver.findElement(By.id("fax")).sendKeys("12345678");
		    driver.findElement(By.id("email")).sendKeys("ankitasankaye15@gmail.com");
		    driver.findElement(By.xpath("//input[@name='email_alt']")).sendKeys("Ankitasankaye23@gmail.com");
	     
		    //radioButton     
	       driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	       driver.findElement(By.xpath("(//input[@type='radio'])[4]")).click();
	       driver.findElement(By.xpath("(//input[@type='radio'])[5]")).click();
	        
		    driver.findElement(By.name("im_id")).sendKeys("125896");
		    
		   WebElement Mes = driver.findElement(By.xpath("//select[@name='im_netowrk']"));
		    
		   Select Mesg = new Select(Mes);
		    Mesg.selectByVisibleText("Google Talk");
		    
		    
		    driver.findElement(By.id("skype_id")).sendKeys("12356");
		    
	      
		    WebElement source = driver.findElement(By.xpath("//select[@name='source']"));
		    
			   Select sos = new Select(source);
			    sos.selectByVisibleText("Event");
			    
			    
			    
		    //Birthdate
			    
			    //driver.findElement(By.name("f_trigger_c_birthday")).click();
			  
	     
			   // driver.findElement(By.className("calendar")).
	       
			   // WebElement skillsDropDown = driver.findElement(By.id("f_trigger_c_birthday"));
				
			//	Select sel4 = new Select(skillsDropDown);
				
			   
				//sel4.selectByIndex(6);
				
	     
	     
	     
	     
	     
	     
	     
	// driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[1]/td/input[2]")).click();
			
			
		  
		
		
		
		
       

	}
	 
}



