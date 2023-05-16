package ObjectOrientedProgram;

public class CreateCompany extends CRMPro
{

	
		
	public static void main(String[] args) {


		//Login
		
		// company create
		// logout
		
		CreateCompany cc = new CreateCompany();
		//System.out.println(cc.logo);
		cc.login();
		cc.createCompany();
		cc.logout();
		

	}
	
	public void createCompany()
	{
		System.out.println("company created successfully");
	}

}
