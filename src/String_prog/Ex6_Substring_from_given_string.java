package String_prog;

import java.util.Scanner;

public class Ex6_Substring_from_given_string {

	public static void main(String[] args) 
	{	
//		String str ="TODO Auto-generated method stub ";
//		String s = str.substring(6,16);
//		System.out.println(s);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		String s = str.substring(6,16);
		System.out.println(s);
	}

}
