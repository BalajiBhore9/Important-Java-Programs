package String_prog;

import java.util.Scanner;

public class Ex9_palindrome {

	public static void main(String[] args) 
	{
		String sc = "kayak";
		StringBuffer str = new StringBuffer(sc);
		str.reverse();
		String s = str.toString();
		if(sc.equals(s))
		{
			System.out.println("string is palindrome");
		}
		else
		{
			System.out.println("string is not palindrome");
		}	
	}
}
