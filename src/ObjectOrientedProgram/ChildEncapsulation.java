package ObjectOrientedProgram;

public class ChildEncapsulation extends Encapsulation
{
	
	public static void main (String[] args) {
		
		ChildEncapsulation ce = new ChildEncapsulation();
		
		ce.getCredentialInfo();
		
		System.out.println(".........................................");
		
		
		ce.setCredentialInfo("Admin", "admin@123");
		ce.getCredentialInfo();
		
	}
	
}
