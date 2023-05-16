package ObjectOrientedProgram;

public class ChildMethodOverriding extends ParentMethodOverriding
{

	public static void main(String[] args) 
	{
		

		ChildMethodOverriding cmo = new ChildMethodOverriding();
		cmo.explicitWait();
		
	}
	
	public void explicitWait()
	{
	
		System.out.println("explicit wait is 100 seconds");

	}


}
