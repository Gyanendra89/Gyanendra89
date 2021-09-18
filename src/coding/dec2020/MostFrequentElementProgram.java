
package coding.dec2020;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MostFrequentElementProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getMostFrequentElement(new int[]{4, 5, 8, 7, 4, 7, 6,7});

        getMostFrequentElement(new int[]{1, 6, 6, 5, 3, 6});

	}

	static void getMostFrequentElement(int inputArray[])
	{
		HashMap<Integer, Integer> elementcount = new HashMap<Integer, Integer>();

		for(int i : inputArray)
		{
			if(elementcount.containsKey(i))
			{
				elementcount.put(i, elementcount.get(i)+1);
			}
			else {
				elementcount.put(i, 1);
			}
		}

		System.out.println("tabular representation of repeated elememt"+elementcount);
		int element =0;
		int frequency = 1;

		Set<Entry<Integer,Integer>> entryset = elementcount.entrySet();

		for(Entry<Integer,Integer> entry : entryset)
		{
			if(entry.getValue()>frequency)
			{
				element = entry.getKey();
				frequency = entry.getValue();
			}
		}
		if(frequency > 1)
        {
            System.out.println("Input Array : "+Arrays.toString(inputArray));

            System.out.println("The most frequent element : "+element);

            System.out.println("Its frequency : "+frequency);

            System.out.println("========================");
        }
        else
        {
            System.out.println("Input Array : "+Arrays.toString(inputArray));

            System.out.println("No frequent element. All elements are unique.");

            System.out.println("=========================");
        }

	}

}
