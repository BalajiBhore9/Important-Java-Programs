package String_prog;

public class Ex15_Find_Duplicate_Elements_in_Array 
{

	public static void main(String[] args) 
	{
		String arr[] = {"java","c","c++","python","java"};
		
		boolean flag = false;
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Found duplicate element: "+arr[i]);
					flag = true;
				}	
			}	
		}
		if(flag == false)
		{
			System.err.println("Duplicate element not found");
		}
	}
}
