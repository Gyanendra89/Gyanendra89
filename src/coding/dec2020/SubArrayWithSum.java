package coding.dec2020;

import java.util.Arrays;

public class SubArrayWithSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subArraySum(new int[]{5, 6, 8, 13, 6, 7, 3,19,0}, 19);
		subArraySum(new int[]{5, 7, 8, 12, 6, 6, 3,9,0}, 12);

	}

	static void subArraySum(int [] inputArray,int inputNum)
	{
		int sum=0;

		for(int i=0;i<inputArray.length;i++)
		{
			sum = inputArray[i];
			for(int j=i+1;j<inputArray.length;j++)
			{
				sum = sum + inputArray[j];

				if(sum==inputNum)
				{
					System.out.println("Continious subarry of "+Arrays.toString(inputArray)+"  whose sum " +inputNum+" is: ");

					for(int k=i;k<=j;k++)
					{
						System.out.print(inputArray[k]+" ");
					}

					System.out.println();

				}

				else if(sum<inputNum)
				{
					continue;
				}

				else if(sum>inputNum)
				{
					break;
				}
			}

		}



	}

}
