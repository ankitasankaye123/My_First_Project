package ObjectOrientedProgram;

public class MethodOverloding {

	public static void main(String[] args) {
		
		MethodOverloding mo = new MethodOverloding();
		mo.login("speedway2016","Speedway@2016"); // user name and pass
		//mo.login("demo@123.gmail.com"); // google account
		//mo.login("123456789");   //mob number

		System.out.println(30+60);
	}
	
	public void login(String username,String password)
	{
		System.out.println("logged in with username and passward");
	}
	
	public void login (int opt)
	{
		System.out.println("logged in with  mobile number");
	}

	public void login (String googleAccount)
	{
		System.out.println("Logged in with google account");
	}
	
	public void login (int PIN , String googleAccount)
	{
		System.out.println("Demo Account login");
	}
	
	
}
