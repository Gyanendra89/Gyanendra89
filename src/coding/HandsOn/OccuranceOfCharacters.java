package coding.HandsOn;

import java.util.HashMap;
import java.util.Set;

public class OccuranceOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countchars("All Is Well");
		countchars("Gyanendra");

	}

	public static void countchars(String str)
	{
		char [] charArray = str.toCharArray();

		HashMap<Character, Integer> countcharmap = new HashMap<Character, Integer>();

		for(char ch : charArray)
		{
			if(countcharmap.containsKey(ch))
			{
				countcharmap.put(ch, countcharmap.get(ch)+1);
			}
			else
				countcharmap.put(ch, 1);
		}

	    System.out.println("For given "+str+"is"+ countcharmap);

	    Set<Character> countset = countcharmap.keySet();

	    for(char ch1 : countset)
	    {
	    	if(countcharmap.get(ch1)>1)
	    	{
	    		System.out.println(ch1+" : "+countcharmap.get(ch1));
	    	}
	    }

	    System.out.println("-------------------------------------");
	}

}
