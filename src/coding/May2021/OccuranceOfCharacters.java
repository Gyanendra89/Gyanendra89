package coding.May2021;

import java.util.HashMap;
import java.util.Set;

public class OccuranceOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//charCount("Java J2EE Java JSP J2EE");

		//charCount("All Is Well");

		charCount("Gyanendra");

	}

	public static void charCount(String str)
	{
		char [] strarray = str.toCharArray();

		HashMap<Character, Integer> countchar = new HashMap<Character, Integer>();

		for(char ch : strarray)
		{
			if(countchar.containsKey(ch))
			{
				countchar.put(ch,countchar.get(ch)+1);
			}
			else
			{
				countchar.put(ch, 1);
			}
		}
		System.out.println("total chars count"+str+" "+countchar);

		Set<Character> charactersInstring = countchar.keySet();
		for(char ch1 : charactersInstring)
		{
			if(countchar.get(ch1)>1)
			{
				System.out.println("Duplicate characters are below:");
				System.out.println(ch1+":"+countchar.get(ch1));
			}
		}
	}

}
