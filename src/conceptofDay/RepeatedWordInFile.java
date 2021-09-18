package conceptofDay;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedWordInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> wordcountmap = new HashMap<String,Integer>();
		BufferedReader reader = null;

		try
		{
			reader = new BufferedReader(new FileReader("C:\\Users\\Gyanendra\\Desktop\\SampleText.txt"));
			String currentline = reader.readLine();
			while(currentline !=null)
			{
				String[] words = currentline.toLowerCase().split(" ");

				for(String word : words)
				{
					if(wordcountmap.containsKey(word))
					{
						wordcountmap.put(word, wordcountmap.get(word)+1);
					}
					else
					{
						wordcountmap.put(word, 1);
					}
				}

				currentline = reader.readLine();
			}

			String mostrepeatedword = null;

			int count = 0;

			Set<Entry<String,Integer>> entryset = wordcountmap.entrySet();

			for(Entry<String,Integer> entry : entryset)
			{
				if(entry.getValue() > count)
				{
					mostrepeatedword = entry.getKey();
					count = entry.getValue();
				}
			}

			System.out.println("The most repeted word in file is : " +mostrepeatedword);
			System.out.println("Number of occurances : " +count);
		}

		catch (IOException e){

			e.printStackTrace();
			}
		finally
		{
			try
			{
				reader.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}

}
