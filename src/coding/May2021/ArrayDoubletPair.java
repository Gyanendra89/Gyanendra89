package coding.May2021;

import java.util.Arrays;

public class ArrayDoubletPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findingArrayPair(new int[] {4, 6, 5, 7,6, 8, 5, 20}, 12);

		findingArrayPair(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);


		findingArrayPair(new int[] {12, 13, 40, 15, 8, 10, -15}, 25);

		findingArrayPair(new int[] {12, 23, 125, 41, -75, 38, 27, 11}, 50);


	}

	public static void findingArrayPair(int inputarray[],int num) {

		System.out.println("Given array is:"+Arrays.toString(inputarray)+" with number "+num);

		int len = inputarray.length;

		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{

				if(inputarray[i]+inputarray[j]==num)
				{
					System.out.println(inputarray[i]+"+"+inputarray[j]+"="+num);
				}
			}
		}

	}
}
