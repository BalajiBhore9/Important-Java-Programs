package StringPractice;

public class SumofDigit {

	public static void main(String[] args) {
		// Sum of digit in given string
		
		String str = "string12356reverse";
		int sum = 0;
		for(int i=0;i<str.length();i++) {
			char temp = str.charAt(i);
			if(Character.isDigit(temp)) {
				int b = Integer.parseInt(String.valueOf(temp));
				sum = b+sum;
			}
		}
		System.out.println(sum);
	}
}
