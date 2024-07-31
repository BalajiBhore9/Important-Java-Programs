package String_prog;

import java.util.Scanner;

public class Ex1_Reverse_String {

	public static void main(String[] args) 
	{
//		String str = "Selenium";
//		String rev = " ";
//		for(int i=str.length()-1;i>=0;i--) 
//		{
//			rev = rev+str.charAt(i);
//		}
//		System.out.println(rev);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String s = sc.nextLine();
		String rev = " ";
		for(int i=s.length()-1;i>=0;i--) 
		{
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
