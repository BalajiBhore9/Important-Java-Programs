package String_prog;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Ex1
{ 
	public static void main(String[] args) 
	{
		//creating an empty hash map by declearing object 
		// of string and interger type
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		// Adding element to the Map using standard add() method 
		hmap.put("Arnav", 10);
		hmap.put("Aditya",20);
		hmap.put("Vihan", 30);
		hmap.put("Kunal", 40);
		for(Map.Entry m :hmap.entrySet()) 
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		// print the size and content of the Map
		System.out.println("Size of map is: "+hmap.size());
		//printing elements in object of Map
		System.out.println(hmap);
		//checking if a key is present and if present, print value by passing random element 
		if(hmap.containsKey("Kunal"))
		{
			Integer a = hmap.get(("Kunal"));
			System.out.println("value of key" + " \" Kunal \" is : "+a);	
		}	
	}
}
