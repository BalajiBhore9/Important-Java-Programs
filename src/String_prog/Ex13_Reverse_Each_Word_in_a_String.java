package String_prog;

public class Ex13_Reverse_Each_Word_in_a_String 
{

	public static void main(String[] args) 
	{
		String str = "This Is My Word";
		String [] words = str.split(" ");
		String reverseString = "";
		for(String w:words)
		{
			String reverseword = "";
			for(int i=w.length()-1;i>=0;i--) 
			{
				reverseword = reverseword+w.charAt(i);
			}
			reverseString = reverseString + reverseword+" ";
		}
		System.out.println(reverseString);
	}

}
