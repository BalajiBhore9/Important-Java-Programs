package String_prog;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) 
	{
		String str = "Reverse String";
		String rev = " ";
		for(int i=str.length()-1;i>=0;i--) 
		{
			rev = rev+str.charAt(i);
		}
		System.out.println("the reverse string is:"+ rev);

	}

}
