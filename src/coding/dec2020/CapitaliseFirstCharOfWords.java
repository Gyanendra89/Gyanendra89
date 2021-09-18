package coding.dec2020;

import java.util.Scanner;

public class CapitaliseFirstCharOfWords {

	public static String CapitaliseCharOfWords(String sentence) {

		// Extract all words
		String words[] = sentence.split("\\s+");

		// Creating an empty string of type StringBuilder so that modification of string is possible.
		StringBuilder sb = new StringBuilder();

		// Iterating through words
		for (String word : words) {
			//Extracting first char
			char firstChar = word.charAt(0);
			// Checking if firstchar is not in upper case already
			if (!Character.isUpperCase(firstChar)) {
				// Convert first char into upper case and then append remaining characters of words.
				sb.append(Character.toUpperCase(firstChar)).append(word.substring(1));
			} else
				sb.append(word.substring(0));

			// Appending space after each word
			sb.append(" ");
		}

		// Converting StringBuilder to String. trim() is needed to trim last space appended.
		String result = sb.toString().trim();
		return result;
	}

	public static void main(String[] args) {

		// User input for the string to know length
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string to Capitalize first char of each word:");

		String userInput = sc.nextLine();

		sc.close();

		System.out.println("You entered: " + userInput);

		System.out.println("Output is :" + CapitaliseCharOfWords(userInput));

	}

}


