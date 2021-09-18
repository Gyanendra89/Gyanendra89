package december.Practise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

public class MaximumWordCount {

	static String path="C:\\Users\\Gyanendra\\eclipse-workspace@11072019\\CodingForInterview\\Demo.txt";

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		HashMap<String,Integer> counthashmap = new HashMap<String,Integer>();
		BufferedReader reader = null;

		reader = new BufferedReader(new FileReader(path));
		String currentline = reader.readLine();
		while(currentline!=null)
		{
			String words [] = currentline.toLowerCase().split(" ");

			for(String word : words)
			{
				if(counthashmap.containsKey(word))
				{
					counthashmap.put(word, counthashmap.get(word)+1);
				}
				else
				{
					counthashmap.put(word, 1);
				}
			}

			currentline = reader.readLine();
		}

		System.out.println(counthashmap);

		counthashmap.forEach((k,v) -> System.out.println(k + " :" +v));

		HashMap<String,Integer> maxWordMap = new HashMap<String,Integer>();

counthashmap
      .entrySet()
            .stream()
                .filter(entry -> entry.getValue()==Collections.max(counthashmap.values()))
                              .forEach(e -> maxWordMap.put(e.getKey(),e.getValue()));

System.out.println("-----------------");
System.out.println(maxWordMap);






	}

}
