package Imp_prog;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_Iterator {

	public static void main(String[] args) 
	{
		List<String> city = Arrays.asList("Pune","Latur","Mumbai","Delhi");
		
		Iterator<String> itr = city.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		for(String list:city) 
		{
			System.out.println("Using list iterator:"+list);
		}
	}

}
