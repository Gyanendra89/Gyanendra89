package coding.makeselenium.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MaximumFrequencyInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frequencyArray(new int[]{4, 5, 8, 7, 4, 7, 6,7});

		frequencyArray(new int[]{1, 6, 6, 5, 3, 6});

	}

	public static void frequencyArray(int[] inputArray)
	{
		HashMap<Integer, Integer> freqCount = new HashMap<Integer, Integer>();

		for(int i : inputArray)
		{
			if(freqCount.containsKey(i))
			{
				freqCount.put(i, freqCount.get(i)+1);
			}

			else
			{
				freqCount.put(i, 1);
			}
		}
		System.out.println("tabular representation of repeated elememt"+freqCount);
		int element=0;
		int frequncy=1;


		Set<Entry<Integer, Integer>> entryset = freqCount.entrySet();

		for(Entry<Integer,Integer> entry : entryset )
		{
			if(entry.getValue()>frequncy)
			{
              element = entry.getKey();
              frequncy = entry.getValue();
			}
		}
		if(frequncy > 1)
        {
            System.out.println("Input Array : "+Arrays.toString(inputArray));

            System.out.println("The most frequent element : "+element);

            System.out.println("Its frequency : "+frequncy);

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
