package StringPractice;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		
		String str ,rev ="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no/string : ");
		str = sc.nextLine();
		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev +str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("Enter no/string palindrome");
		}
		else
		{
			System.out.println("Enter no/string not palindrome");
		}
	}
}
