package String_prog;

public class Ex12_sum_digit_in_string {

	public static void main(String[] args)
	{
		String str = "123java456";
		int sum = 0;
		for(int i=0;i<str.length();i++) 
		{
			char temp = str.charAt(i);
			if(Character.isDigit(temp)) 
			{
				int b = Integer.parseInt(String.valueOf(temp));
				sum = sum +b;
			}
		}
		System.out.println(sum);
	}
}
