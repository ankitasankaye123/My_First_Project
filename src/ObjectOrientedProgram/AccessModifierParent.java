package ObjectOrientedProgram;

public class AccessModifierParent {
	
	public String companyName = "SpeedwayTech";
	
	
	private int amount = 1000;

	public static void main(String[] args) {
		
		AccessModifierParent am = new AccessModifierParent();
		System.out.println(am.amount);

	}

	public void printAmount()
	{
		System.out.println("amount");
		
	}
	protected void demoMethod()
	{
		System.out.println("This is protected method");
	}
}
