package String_prog;

import java.util.HashSet;

public class Ex16_Find_Duplicate_Elements_in_Array 
{

	public static void main(String[] args)
	{
		String arr[] = {"java","c","c++","python","java"};
		
		HashSet <String> lang = new HashSet();
		boolean flag = false;
		for(String l:arr) 
		{
			if(lang.add(l)==false)
			{
				System.out.println("Found Duplicate Element: "+l);
				flag =true;
			}
		}
		if(flag==false) 
		{
			System.out.println("NotFound Duplicate Element");
		}
	}
}
