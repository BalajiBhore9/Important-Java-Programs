package String_prog;

public class Char_count {

	public static void main(String[] args)
	{
		String str = "This is simple sentence";
		int count = 0;
		for(int i=0;i<str.length();i++) 
		{
			if(str.charAt(i)!=' ') 
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
