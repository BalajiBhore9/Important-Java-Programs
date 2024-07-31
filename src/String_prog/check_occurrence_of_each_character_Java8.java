package String_prog;

public class check_occurrence_of_each_character_Java8 {

	public static void main(String[] args)
	{
		String str = "abracadabra-banana";
		System.out.println(str);
		// count occurrence
		long count = str.chars().filter(ch -> ch =='a').count();
		System.out.println("occurrence of a: "+count);
	}

}
