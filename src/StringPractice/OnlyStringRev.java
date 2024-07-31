package StringPractice;

public class OnlyStringRev {
	
	//Reverse only letters in string and keep the same order of the words
	public static void revString(char[]arr) {
		
		int l=0;
		int r=arr.length-1;
		while(l<r)
		{	
			if(!Character.isAlphabetic(arr[l]))
			{
				l++;
			}
			else if(!Character.isAlphabetic(arr[r])) 
			{
				r--;
			}
			else 
			{
				char temp = arr[r];
				arr[r] = arr[l];
				arr[l] = temp;
				l++;
				r--;
			}
		}
		
	}
	public static void main(String[] args) {
		
		String str = "Vi8na#yak";
		char[] ch = str.toCharArray();
		revString(ch);
		String st = new String(ch);
		System.out.println(st);
	}	
}
