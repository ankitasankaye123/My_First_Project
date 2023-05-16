package ObjectOrientedProgram;

public class Parent  extends Child
{

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.childDemoMethod();
		

	}
	public void parentDemoMethod()
	{
		System.out.println("this is parent class method");
	}

}
