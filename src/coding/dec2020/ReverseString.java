package coding.dec2020;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Gyanendra";

		char[] charArray = str.toCharArray();

		for(int i=charArray.length-1;i>=0;i--)
		{
			System.out.print(charArray[i]);
		}

	}

}
