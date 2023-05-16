package TestNGconcept;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationConcept {
	
	
	@BeforeSuite
	public void bs()
	{
		System.out.println("Before suite annotation");
	}
	@BeforeTest
	public void bt()
	{
		System.out.println("Before test annotation");
		
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("Before class annotation");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("Before method annotation");
	}
	
  @Test
  public void loginTest() {
	  
	  System.out.println("Login test passed");
  }
  @AfterMethod
  public void am()
  {
  System.out.println("after suite annotation");
  }
  
  @AfterClass
  public void ac()
  {
	  System.out.println("After suite annotation");
  }
  @AfterTest
  public void at()
  {
	  System.out.println("after suite annotation");
  }
 
	
	
  @Test
  public void logoutTest()
  {
	  System.out.println("Logout test passed");
	  
  }
  @Test 
  public void linksTest()
  {
	  System.out.println("Links Test passed");
  }
}
