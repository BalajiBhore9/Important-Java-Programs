package Imp_prog;

public class Static_sample2 
{
	public static void sample2() 
	{
		System.out.println("static 2 method created ");
	}

	public static void main(String[] args)
	{
		static_sample1  s1 = new static_sample1();
		s1.sample1();
		
		Static_sample2 s2 = new Static_sample2();
		s2.sample2();
	}
}
