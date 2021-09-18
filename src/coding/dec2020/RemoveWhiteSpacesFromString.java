package coding.dec2020;

import java.util.Scanner;

public class RemoveWhiteSpacesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter input string to be cleaned from white spaces...!");

        String inputString = sc.nextLine();

        char[] charArray = inputString.toCharArray();

        String stringWithoutSpaces = "";

        for (int i = 0; i < charArray.length; i++)
        {
            if ( (charArray[i] != ' ')&&(charArray[i] != '\t') )
            {
                stringWithoutSpaces = stringWithoutSpaces + charArray[i];
            }
        }

        System.out.println("Input String : "+inputString);

        System.out.println("Input String Without Spaces : "+stringWithoutSpaces);

        sc.close();

	}

}
