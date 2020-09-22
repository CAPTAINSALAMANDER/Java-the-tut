package mytakeonjabba;
 
public class MyClass5 {
	static final int number = 5;
	static final double Freezing_point = 32.0;
	static final double conversion_factor = 5.0/9.0;
	static double fahrenheit = 50;
	static double celsius;
	
public static void main(String[] args) 
{
 //Fahrenheit to celsius
 //constraints
 celsius = conversion_factor * (fahrenheit - Freezing_point ) ;
 System.out.println(fahrenheit + " degree fahrenheit = " + celsius + "  degree celsius ");

	
}
}
