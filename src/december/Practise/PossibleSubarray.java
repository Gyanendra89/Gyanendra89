package december.Practise;

import java.util.Arrays;

public class PossibleSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//possibleSubArray(new int []{3,4,5,6,6,8}, 12);

		possibleSubArray(new int []{2,3,4,1,5,6},7);

	}

	public static void possibleSubArray(int [] inputArray,int number)
	{
		int sum=0;

		for(int i=0;i<inputArray.length;i++)
		{
			sum=inputArray[i];

			for(int j=i+1;j<inputArray.length;j++)
			{
				sum = sum + inputArray[j];

				if(sum==number)
				{
					System.out.println("Given array is: "+Arrays.toString(inputArray) + number + "is");

					for(int k=i;k<=j;k++)
					{
						System.out.print(inputArray[k]+" ");

					}
					System.out.println();
				}
				else if(sum<number)
				{
					continue;
				}
				else if(sum>number)
				{
					break;
				}
			}
		}
	}

}
