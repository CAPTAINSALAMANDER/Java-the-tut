package mytakeonjabba;

public class MyClass8 {
public static void main(String[] args)
{
String animal = "MARS";
String animal2 = "cows";
String animal3 = "crow";
String newanimal = animal2 + animal3 ;
System.out.println("LAST CHARACTER :" + animal.charAt(3));
//picking up specific character at an index in a string
System.out.println("STRING LENGTH :"+animal.length());
//Finding out the amount of characters in the string
System.out.println("EQUAL CHECK :" + newanimal.equals("cowscrow")) ;
System.out.println("EQUAL CHECK :" + newanimal.equals("CowsCrows")) ;
//equal check wether adding 2 strings will give the same result

}
}
