package StringPractice;
import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		  String str, reverse = ""; // Objects of String class  
	      Scanner input = new Scanner(System.in);   
	      System.out.println("Enter a string/number to check if it is a palindrome");  
	      str = input.nextLine();   
	      int length = str.length();   
	      for ( int i = length - 1; i >= 0; i-- ) 
	      { 
	         reverse = reverse + str.charAt(i);  
	      }
	      if (str.equals(reverse)) 
	      {  
	         System.out.println("Entered string/number is a palindrome.");  
	      }else {  
	         System.out.println("Entered string/number isn't a palindrome."); 
	      }
	}

}
