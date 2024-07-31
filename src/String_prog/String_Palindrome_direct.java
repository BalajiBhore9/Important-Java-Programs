package String_prog;

public class String_Palindrome_direct {

	public static void main(String[] args) 
	{
		String str = "kayak";
		
		StringBuffer st = new StringBuffer(str);
		st.reverse();
		String st1 = st.toString();
		if(str.equals(st1)) 
		{
			System.out.println("string is palindrome");
		}
		else 
		{
			System.out.println("string is not palindrome");
		}
	}

}
