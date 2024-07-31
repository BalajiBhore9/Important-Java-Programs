package String_prog;

public class Duplicate_char {

	public static void main(String[] args) 
	{
		String str = "Ramayan";
		char[] st = str.toCharArray();
		System.out.println("Duplicate char is: ");
		for(int i=0;i<str.length();i++) 
		{
			for(int j=i+1;j<str.length();j++) 
			{
				if(st[i]==st[j]) 
				{
					System.out.println(st[j]);
					break;
				}
			}
		}
	}
}
