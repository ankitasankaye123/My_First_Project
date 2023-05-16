package TestNGconcept;

import org.testng.annotations.Test;

public class TimeOutCount {
  
  
	  @Test
		(timeOut =10000)
		public void timeOutTest ()
		{
			int i = 1;
			while (i<2)
			{
				System.out.println("TestNg");
			}
  }
}
