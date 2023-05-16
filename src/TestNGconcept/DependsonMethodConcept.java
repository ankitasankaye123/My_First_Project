package TestNGconcept;

import org.testng.annotations.Test;

public class DependsonMethodConcept {
  @Test
  public void validateLoginTest() {
	  
	  System.out.println("Logged in successfully");
	  //int i = 1/0;
  }
  
  @Test(dependsOnMethods = "validateLoginTest")
  public void validateCreateContactTest() {
	  
	  System.out.println("contact has been created");
  }
  
  @Test(dependsOnMethods = "validateLoginTest")
  public void validateCreateCompanyTest() {
	  
	  System.out.println("Company has been createded");
  }
}
