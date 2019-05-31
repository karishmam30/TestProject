import java.util.Scanner;

public class reverseaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string which you want to reverse::\n");
		String input = sc.nextLine();
		
		//method1
		//StringBuffer sb = new StringBuffer(input);
		//System.out.println(sb.reverse());
		
		//method2
		
//		char[] charArray = input.toCharArray();
//		for(int i=charArray.length-1; i>=0; i--)
//		{
//			System.out.print(charArray[i]);
//		}
//		
		//method3
		System.out.print(recursiveMethod(input));
	}
	
	public static String recursiveMethod(String str)
	{
		if(str==null || str.length()<=1)
		{
			return str;
		}
		else {
			return recursiveMethod(str.substring(1))+(str.charAt(0));
		}
	}

}
