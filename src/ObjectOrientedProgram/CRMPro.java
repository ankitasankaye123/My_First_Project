package ObjectOrientedProgram;

public class CRMPro 
{
	String logo = "CRMPRO" ;
	public static void main(String[] args) {
		CRMPro pro = new CRMPro();
		pro.login();
		pro.createContact();
		pro.logout();
		
		

	}
	
	public void login()
	{
		System.out.println("logged in successfully");
	}
	
	public void createContact()
	{
		System.out.println("Contact created successsfully");
	}
	
	public void logout()
	{
		System.out.println("logged out successfully");
	}
	
	

}
