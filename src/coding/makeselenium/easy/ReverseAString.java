package coding.makeselenium.easy;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String str = "abcde";
		//String str1 = "pal";
		//System.out.println(recursiveMethod(str));

		//int length = str.length();
//
//		for(int i=str.length()-1;i>=0;i--)
//		{
//			System.out.print(str.charAt(i));
//		}


	System.out.println(reverserecursion("Gyanendra"));

	}

	public static String reverserecursion(String str1)
	{

		if(str1.length() <= 1 || str1== null)
		{
			return str1;

		}

		return reverserecursion(str1.substring(1))+ str1.charAt(0);



	}
}





