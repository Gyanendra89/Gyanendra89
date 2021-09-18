package coding.testdata;

import java.util.Arrays;

public class PossibleSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		combinationArray(new int [] {1,4,5,6,7,3},10);
	}

	public static void combinationArray(int [] inputarray,int number)
	{
		int sum =0;

		for(int i=0;i<inputarray.length;i++)
		{
			sum = inputarray[i];

			for(int j=i+1;j<inputarray.length;j++)
			{

				sum = sum +inputarray[j];
				if(sum==number)
				{
					System.out.println("number in array: "+Arrays.toString(inputarray)+number+"is");

					for(int k=i;k<=j;k++)
					{
						System.out.print(inputarray[k]+" ");
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
