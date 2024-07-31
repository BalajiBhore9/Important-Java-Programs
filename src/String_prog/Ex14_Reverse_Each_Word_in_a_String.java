package String_prog;

public class Ex14_Reverse_Each_Word_in_a_String
{

	public static void main(String[] args) 
	{
		String str = "This Is My Word";
		String [] word = str.split(" ");
		String reverseString = "";
		for(String w:word)
		{
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseString = reverseString +sb.toString()+" ";
		}
		System.out.println(reverseString);
	}

}
