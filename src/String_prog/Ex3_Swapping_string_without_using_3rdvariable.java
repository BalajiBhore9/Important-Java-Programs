package String_prog;

public class Ex3_Swapping_string_without_using_3rdvariable {

	public static void main(String[] args) 
	{
		String a = "hello";
		String b = "world";
		System.out.println("before swapping string: "+a+" "+b);
		a = a+b;
		b = a.substring(0,a.length()-b.length());
		a = a.substring(b.length());
		System.out.println("After swapping string: "+a+" "+b);
	}

}
