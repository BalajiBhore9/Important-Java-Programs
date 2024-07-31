package StringPractice;

public class ReverseNumAndSum {

	public static void main(String[] args) {
		
		int num = 123654;
		int a=0, m=0, sum = 0;
		do 
		{
			a = num % 10;
			m = m * 10 + a;
			sum = sum + a;
			num = num / 10;
		}
		while(num>0);
		System.out.println("Reverse num is: "+m);
		System.out.println("Sum of reverse num is: "+sum);
	}

}
