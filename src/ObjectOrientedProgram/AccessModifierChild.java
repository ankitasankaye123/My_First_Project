package ObjectOrientedProgram;

public class AccessModifierChild extends AccessModifierParent
{

	public static void main(String[] args) {
		AccessModifierChild ac = new AccessModifierChild();
		
		ac.printAmount();
		
		
		

	}
	
	protected void demoMethod()
	{
		System.out.println("Child class demo method");
	}

}
