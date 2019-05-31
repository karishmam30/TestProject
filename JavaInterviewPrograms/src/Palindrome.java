
public class Palindrome {
	
	public static void main(String[] s)
	{
		String str = "Nitin";
		
		char[] strArray = str.toCharArray();
		for(int i=strArray.length-1; i>1; i--) {
			
			System.out.print(strArray[i]);
		}
	
	}

}
