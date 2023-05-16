package TestNGconcept;

import org.testng.annotations.Test;

public class GroupConcept 

//sanity testing 
//regression testing

{
  @Test (groups = "Regression Test")
  public void logoTest() 
  {
	  
	  System.out.println("Logo is displayed");
	  
  }
  
  @Test (groups = "Regression Test")
  public void titleTest() 
  {
	  
	  System.out.println("Title  is validated");
	  
  }
  
  @Test (groups = {"Regression Test" , "Sanity Test"})
  public void validateLoginTestTest() 
  {
	  
	  System.out.println("Logged in successfully");
	  
  }
  
  @Test (groups = "Regression Test")
  public void validateCreateContactTest() {
	  
	  System.out.println("contact has been created");
  }
  
  @Test (groups = {"Regression Test" , "Sanity Test"})
  public void validateCreateCompanyTest() {
	  
	  System.out.println("Company has been createded");
  }
  
}
