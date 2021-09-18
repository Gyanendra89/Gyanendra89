package coding.May2021;

public class ReverseEachWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reverseEachWord("Gyanendra kumar pal");
		reverseEachWord("Ariket pal");
		reverseEachWord("Aparajita Nath");
		reverseEachWord("Reverse Me");

	}

	static void reverseEachWord(String inputstring)
	{
		String[] words = inputstring.split(" ");
		String reversestring = "";

		for(int i=0;i<words.length;i++)
		{
			String word = words[i];
			String reverseword="";

			for(int j=word.length()-1;j>=0;j--)
			{
				reverseword = reverseword + word.charAt(j);
			}

			reversestring = reversestring + reverseword + " ";
		}

		System.out.println(inputstring);
		System.out.println("After each word reverse from Sentence");
		System.out.println(reversestring);
	}
}
