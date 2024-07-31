package String_prog;

import java.util.Scanner;

public class Ex2_Reverse_Number {

	public static void main(String[] args) 
	{
//		int num =1234;
//		int rev = 0;
//		while(num!=0) 
//		{
//			rev = (rev*10)+num%10;
//			num = num/10;
//		}
//		System.out.println(rev);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		int rev = 0;
		while(num!=0) 
		{
			rev = (rev*10)+num%10;
			num = num/10;
		}
		System.out.println(rev);
		
	}

}
