package december.Practise;

import java.util.HashMap;
import java.util.Set;

public class OccuranceCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		occuranceOfChars("aparajita");

	}

	public static void occuranceOfChars(String str)
	{
		char [] charArray = str.toCharArray();

		HashMap<Character,Integer> hasmapobj = new HashMap<Character,Integer>();

		for(char ch : charArray)
		{
			if(hasmapobj.containsKey(ch))
			{
				hasmapobj.put(ch, hasmapobj.get(ch)+1);
			}
			else
				hasmapobj.put(ch, 1);
		}

		Set<Character> countset = hasmapobj.keySet();

		for(char ch1 : countset)
		{
			if(hasmapobj.get(ch1)>1)
			{
				System.out.println("Duplicates charcters are in given  " +str  + "is  " +ch1 + ":" + hasmapobj.get(ch1));
			}
		}

	}

}
