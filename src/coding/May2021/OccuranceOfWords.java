package coding.May2021;

import java.util.HashMap;
import java.util.Set;

public class OccuranceOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//charCount("Java J2EE Java JSP J2EE");

		//charCount("All Is Well");

		wordsCount();

	}

	public static void wordsCount()
	{
		String [] strarray = { "Apple", "Orange", "Mango", "Apple", "Mango", "Orange", "Orange" };

		HashMap<String, Integer> countchar = new HashMap<String, Integer>();

		for(String ch : strarray)
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
		System.out.println("total chars count" +countchar);

		Set<String> charactersInstring = countchar.keySet();
		for(String ch1 : charactersInstring)
		{
			if(countchar.get(ch1)>1)
			{
				System.out.println("Duplicate characters are below:");
				System.out.println(ch1+":"+countchar.get(ch1));
			}
		}
	}

}
