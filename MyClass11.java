package mytakeonjabba;
import java.util.Scanner;

public class MyClass11 {
   //FINDING INITIAL CHARACTERS OF STRINGs
	static String name;
	static String lastname;
	
	public static void main(String[] args)
	{   String temp ;
		Scanner obj = new Scanner(System.in);
		System.out.println("WRITE YOUR FULL NAME FOLLOWED BY SPACES IN BETWEEN :");
		name = obj.next();
		lastname = obj.next();
		System.out.println("YOUR INITAL CHARACTERS ARE :"+name.charAt(0)+ "\t" + lastname.charAt(0));
		
	}
}
