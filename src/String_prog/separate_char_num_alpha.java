	package String_prog;

public class separate_char_num_alpha {

	public static void main(String[] args)
	{
		String str = "122!@string456*&^%";
		
		StringBuffer num = new StringBuffer(),
				  splchr = new StringBuffer(),
				  alphabet = new StringBuffer();
		for(int i=0;i<str.length();i++) 
		{
		    if(Character.isDigit(str.charAt(i)))num.append(str.charAt(i));
		    else if(Character.isAlphabetic(str.charAt(i)))alphabet.append(str.charAt(i));
		    else
		    	splchr.append(str.charAt(i));
		}
		System.out.println(num);
		System.out.println(splchr);
		System.out.println(alphabet);
	}

}
