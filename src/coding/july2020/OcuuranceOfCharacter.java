package coding.july2020;

import java.util.HashMap;
import java.util.Set;

public class OcuuranceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		charcount("Java J2EE Java JSP J2EE");

	       charcount("All Is Well");

	       charcount("Done And Gone");

		}

	public static void charcount(String str)
	{
	HashMap<Character, Integer> charcountmap = new HashMap<Character, Integer>();

		char[] strArray = str.toCharArray();

		for(char ch : strArray)

		{
			if(charcountmap.containsKey(ch))
			{
				charcountmap.put(ch, charcountmap.get(ch)+1);
			}

			else

				charcountmap.put(ch, 1);

		}

		System.out.println(str+" "+charcountmap);

		Set<Character> charactersInString = charcountmap.keySet();

		for (char ch3 : charactersInString)
		{
			if(charcountmap.get(ch3) > 1)
			{
				System.out.println(ch3+" : "+charcountmap.get(ch3));
			}
		}
	}


}
