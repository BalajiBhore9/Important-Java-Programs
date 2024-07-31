package String_prog;

import java.util.Scanner;

public class Ex8_Factorial_number {

	public static void main(String[] args)
	{
//		int num = 5;
//		long fact = 1;
//		for(int i=1;i<=num;i++) 
//		{
//			fact = fact*i;
//		}
//		System.out.println("factorial of 5 is: "+fact);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		int num = sc.nextInt();
		long fact =1;
		for(int i=1;i<=num;i++) 
		{
			fact = fact*i;
		}
		System.out.println("factorial of giver num is: "+fact);
	}

}
