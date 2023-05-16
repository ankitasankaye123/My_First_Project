package ObjectOrientedProgram;

public class MagarpattaHDFCBranch extends HDFC
{

	public static void main(String[] args) {


		MagarpattaHDFCBranch hdfc = new MagarpattaHDFCBranch();
		hdfc.deposit();
		hdfc.withdraw();
		hdfc.nrOfEmployee();
		

	}
	
	public void deposit()
	{
		System.out.println("User can deposit money");
	}

}
