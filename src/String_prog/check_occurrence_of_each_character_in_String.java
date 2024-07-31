package String_prog;

import java.util.HashMap;

public class check_occurrence_of_each_character_in_String {

	public static void main(String[] args)
	{
		String str = "Welcome To Tutorials Point";
		HashMap <Character,Integer> hmap = new HashMap<>();
		for(int i = str.length()-1;i>=0;i--) 
		{
			if(hmap.containsKey(str.charAt(i))) 
			{
				int count = hmap.get(str.charAt(i));
				hmap.put(str.charAt(i), ++count);
			}
			else 
			{
				hmap.put(str.charAt(i),1);
			}
		}
		System.out.println(hmap);
	}
}
