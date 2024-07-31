package String_prog;

public class Ex10_seperate_char_splchar_num {

	public static void main(String[] args) 
	{
		String str = "1234java@#$%45selenium!*&^";
		StringBuffer num = new StringBuffer(),
				 splchar = new StringBuffer(),
				strchar  = new StringBuffer();
		for(int i=0;i<=str.length()-1;i++) 
		{
			if(Character.isDigit(str.charAt(i)))num.append(str.charAt(i));
			else if(Character.isAlphabetic(str.charAt(i)))strchar.append(str.charAt(i));
			else
				splchar.append(str.charAt(i));
		}
		System.out.println(num);
		System.out.println(splchar);
		System.out.println(strchar);
	}

}
