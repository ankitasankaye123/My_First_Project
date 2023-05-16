package ObjectOrientedProgram;

public class Encapsulation {

	 private String username = "speedway2016";
	private String password = "Speedway@2016";
	
	
	
		public void getCredentialInfo()
		{
			System.out.println(username);		
			System.out.println(password);	
		}
		
		public void setCredentialInfo(String uname,String pwd)
		{
			username = uname;
			password = pwd;
		}
	
}
