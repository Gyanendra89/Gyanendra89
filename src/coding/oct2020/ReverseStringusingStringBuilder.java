package coding.oct2020;

import java.util.Scanner;

public class ReverseStringusingStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Strings to reverse: ");
		String str = sc.nextLine();

		int i = str.length();

		StringBuffer sbufr = new StringBuffer();

		for(int j=i-1;j>=0;j--)
		{
			sbufr.append(str.charAt(j));
		}

		System.out.println(sbufr);
	}

}
