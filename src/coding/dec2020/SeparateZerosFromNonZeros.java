package coding.dec2020;

import java.util.Arrays;

public class SeparateZerosFromNonZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		moveZerosToEnd(new int[] {12, 0, 7, 0, 8, 0, 3});

        moveZerosToEnd(new int[] {1, -5, 0, 0, 8, 0, 1});

        moveZerosToEnd(new int[] {0, 1, 0, 1, -5, 0, 4});

        moveZerosToEnd(new int[] {-4, 1, 0, 0, 2, 21, 4});

	}

	static void moveZerosToEnd(int [] inputArray)
	{
		int counter = 0;

		System.out.println("Arrays before SeparateZerosFromNonZeros:"+Arrays.toString(inputArray));

		for(int i=0;i<inputArray.length;i++)
		{
			if(inputArray[i] !=0)
			{
			  inputArray[counter]=inputArray[i];

			  counter++;
			}

		}

		while(counter<inputArray.length)
		{
			inputArray[counter]=0;
			counter++;
		}

		System.out.println("Arrays after SeparateZerosFromNonZeros:"+Arrays.toString(inputArray));
	}


}
