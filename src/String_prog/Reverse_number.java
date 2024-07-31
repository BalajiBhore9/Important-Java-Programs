package String_prog;

import java.util.Scanner;

public class Reverse_number 
{
	public static void main(String[] args) 
	{
//		int num = 1234;
//		int rev = 0;
//		while(num!=0) 
//		{
//			rev = (rev*10)+num%10;
//			num = num/10;
//		}
//		System.out.println(rev);
		
		Scanner sc = new Scanner(System.in);
		int rev =0;
		System.out.println("enter num: ");
		int num = sc.nextInt();
		while(num!=0) 
		{
			rev = (rev*10)+num%10;
			num=num/10;
		}
		System.out.println(rev);
		
	}

}
