package coding.oct2020;

import java.util.Scanner;

public class AllSubStringOfString {
	private static void printAllSubstrings(String inputString)
    {
        System.out.println("All possible substrings of "+inputString+" are : ");

        for (int i = 0; i < inputString.length(); i++)
        {
            for (int j = i+1; j <= inputString.length(); j++)
            {
                System.out.println(inputString.substring(i, j));
            }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);

	        System.out.println("Enter Input String : ");

	        String inputString = sc.next();

	        printAllSubstrings(inputString);

	        sc.close();

	}

}
