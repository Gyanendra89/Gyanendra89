package coding.july2020;

import java.util.Scanner;

public class removeWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to be trimmed whitespaces...");
		String inputstring = sc.nextLine();
		char [] charArray = inputstring.toCharArray();
		
		String stringwithoutwhitespace = "";
		
		for(int i=0;i<charArray.length;i++)
		{
			if((charArray[i] !=' ')&&(charArray[i] !='\t'))
			{
				stringwithoutwhitespace = stringwithoutwhitespace+charArray[i];
			}
		}
		
		System.out.println("Input String : "+inputstring);
        
        System.out.println("Input String Without Spaces : "+stringwithoutwhitespace);
         
        sc.close();

	}

}
