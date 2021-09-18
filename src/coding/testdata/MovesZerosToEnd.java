package coding.testdata;

import java.util.Arrays;

public class MovesZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		moveZerosToEnd(new int [] {1,0,3,0,4,0,9,8});

	}

	public static void moveZerosToEnd(int inputarray[])
	{
		int counter=0;

		System.out.println("Original Array: "+Arrays.toString(inputarray));

		for(int i=0;i<inputarray.length;i++)
		{
			if(inputarray[i]!=0)
			{
				inputarray[counter] = inputarray[i];
				counter++;
			}
		}

		while(counter<inputarray.length)
		{
			inputarray[counter]=0;
			counter++;
		}

		System.out.println("After moving zeros to end: "+Arrays.toString(inputarray));

	}

}
