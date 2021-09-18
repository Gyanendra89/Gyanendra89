package com.septemberPractise2021;

public class SubArrayForSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//subArray(new int [] {2,3,4},7);
		subArray(new int [] {2,3,4,1,5,6},9);


	}

	public static void subArray(int inputArray[],int number)
	{
		int sum=0;

		for(int i=0;i<inputArray.length;i++)
		{

			sum =inputArray[i];
			for(int j=i+1;j<inputArray.length;j++)
			{
				sum = sum + inputArray[j];

				if(sum==number)
				{
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
