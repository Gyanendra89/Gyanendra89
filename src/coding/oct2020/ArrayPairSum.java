package coding.oct2020;

import java.util.Arrays;

public class ArrayPairSum {

	private static void getArrayPairs(int[] inputArray, int sum)
    {
        System.out.println("Input Array : "+Arrays.toString(inputArray));

        System.out.println("Given Number : "+sum);

        System.out.println("Array triplets whose sum is "+sum+" are :");

        //Method 1 : Using Brute Force Method

        for (int i = 0; i < inputArray.length-1; i++)
        {
            for (int j = i+1; j < inputArray.length; j++)
            {

                    if (inputArray[i]+inputArray[j] == sum)
                    {
                        System.out.println("["+inputArray[i]+", "+inputArray[j]+"]");
                    }

            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getArrayPairs(new int[] {7, 5, 9, 3, 0, 8, 6}, 10
				);

        System.out.println("===========================");
        getArrayPairs(new int[] {-3, 7, -1, -5, 2, -9, 1}, 4);

        System.out.println("===========================");

        getArrayPairs(new int[] {-17, 65, 39, 29, 33, 21, 51,85}, 68);

        System.out.println("===========================");

        getArrayPairs(new int[] {4,5,6,7,8},12);


	}

}
