package com.daily.practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MostFrequentElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mostfrequentElement(new int [] {1,2,3,4,3,3,5,1,1,3});
		//System.out.println(mostfrequentElement(new int [] {1,2,3,4,3,3,3,}));
	}

	public static void mostfrequentElement(int[] inputArray)
	{

		HashMap<Integer, Integer> countfreq = new HashMap<Integer, Integer>();

		for(int num : inputArray) {
			if(countfreq.containsKey(num))
			{
				countfreq.put(num, countfreq.get(num)+1);
			}
			else
				countfreq.put(num, 1);

		}

		System.out.println("Given array is"+Arrays.toString(inputArray));
		System.out.println("Tabular representation of Given array is"+countfreq);

		Set<Entry<Integer,Integer>> entryset = countfreq.entrySet();
		int elemnt=0;
		int frequency=1;


		for(Entry<Integer,Integer> countentry : entryset)
		{
			if(countentry.getValue()>frequency)
			{
				elemnt = countentry.getKey();
				frequency=countentry.getValue();
			}
		}

		if(frequency>1)
		{
			System.out.println("Element is "+elemnt);
			System.out.println("Frequency of element is "+frequency);
		}
  	}

}
