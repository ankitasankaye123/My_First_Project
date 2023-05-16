package exeptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exeptionconcept {

	public static void main(String[] args) {
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		
		
		// if we want to read file in a program 
		try 
		{
			FileInputStream file = new FileInputStream("E:\\Demo.txt");
			
		}
		catch (FileNotFoundException e) {
			
			//exeception Handlings
			System.out.println("File is not avaiable , please add file");
		}
		
		
		int a[] = {1,2,3};
		System.out.println(a[4]);
		
		
		
	//	int a= 1/10 ;   // int a = 1/0 error exception arithmetic
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
	}

}
