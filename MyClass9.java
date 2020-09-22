package mytakeonjabba;
import java.util.Scanner;
//import the scanner class
//input
public class MyClass9 {
	
	static double temp = 0 ;
	static String name ;
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		//MAKE AN OBJECT FOR THE SCANNER CLASS
		System.out.println("Enter your name: ");
		//PRINT A MESSAGE
		name = obj.nextLine();
		//save the input in a variable
		System.out.println("YOUR NAME IS "+name);
		//check wether the input has been stored in the variable
	}
	
}
