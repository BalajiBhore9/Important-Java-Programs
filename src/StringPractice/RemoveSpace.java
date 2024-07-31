package StringPractice;

public class RemoveSpace {

	public static void main(String[] args) {
		
		String str = "Wel l co  me to I  nte rview";
		String s = str.replace(" ", "");
		System.out.println(s.substring(0,4)+" "+s.substring(4,8)+" "+s.substring(8,10)+" "+s.substring(10));
	}
}
