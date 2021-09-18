package coding.dec2020;

import java.util.Arrays;

public class SortOf0s1S2SInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortingOfArray(new int[] {1, 0, 2, 2, 0, 2, 1, 2, 1, 1, 2, 0});

        System.out.println("=====================================");

        sortingOfArray(new int[] {1, 2, 0, 2, 0, 1, 0, 2, 1, 0, 0, 2});

        System.out.println("=====================================");

        sortingOfArray(new int[] {2, 1, 0, 0, 1, 2, 2, 0, 1, 0, 2, 1});

        System.out.println("=====================================");

	}
	private static void sortingOfArray(int [] inputArray)
	{
		int ZeroCounter = 0;
		int OneCounter = 0;
		int TwoCounter = 0;

		System.out.println("Arrays before Sorting:"+Arrays.toString(inputArray));

		for(int i=0;i<inputArray.length;i++)
		{
			if(inputArray[i]==0)
			{
				ZeroCounter++;
			}
			if(inputArray[i]==1)
			{
				OneCounter++;
			}
			if(inputArray[i]==2)
			{
				TwoCounter++;
			}
		}

		for(int i=0;i<ZeroCounter;i++)
		{
			inputArray[i]=0;
		}
		for(int i=ZeroCounter;i<(ZeroCounter+OneCounter);i++)
		{
			inputArray[i]=1;
		}
		for(int i=(ZeroCounter+OneCounter);i<inputArray.length;i++)
		{
			inputArray[i]=2;
		}


		System.out.println("Arrays after Sorting:"+Arrays.toString(inputArray));
	}

}
