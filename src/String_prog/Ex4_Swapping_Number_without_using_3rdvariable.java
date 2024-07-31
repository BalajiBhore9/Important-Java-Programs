package String_prog;

public class Ex4_Swapping_Number_without_using_3rdvariable {

	public static void main(String[] args)
	{
		int x = 10;
		int y = 20;
		System.out.println("before swapping string: "+x+" "+y);
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("After swapping string: "+x+" "+y);
	}

}
