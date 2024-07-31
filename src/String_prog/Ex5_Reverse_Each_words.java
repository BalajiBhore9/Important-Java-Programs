package String_prog;

import java.util.Scanner;

public class Ex5_Reverse_Each_words {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		sc.close();
//		String str = "Characters from String";
		String rev = " ";
		String words [] = str.split(" ");
		for(int i=0;i<words.length;i++) 
		{
			if(i==words.length-1) 
			{
				rev = words[i]+rev;
			}
			else 
			{
				rev = " "+words[i]+rev;
			}
		}
		System.out.println("reverse each words: "+rev);
	}
}
