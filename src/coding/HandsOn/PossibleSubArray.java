package coding.HandsOn;

import java.util.Arrays;

public class PossibleSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//findingSubArray(new int[]{5, 6, 8, 13, 6, 7, 3,19,0}, 19);
		//findingSubArray(new int[]{5, 7, 8, 12, 6, 6, 3,9,0}, 12);
		//findingSubArray(new int [] {3,4,5,6,6,8,5,2},12);
		findingSubArray(new int [] {2,3,4,1,5,6},7);



	}

	public static void findingSubArray(int inputArray[],int givenNumber)
	{
		int sum=0;


		for(int i=0;i<inputArray.length;i++)
		{
			 sum=inputArray[i];

			 for(int j=i+1;j<inputArray.length;j++)
			 {
				 sum = sum + inputArray[j];

				 if(sum==givenNumber)
				 {
					 System.out.println("Input of givem number in:"+Arrays.toString(inputArray)+"is"+givenNumber);

					 for(int k=i;k<=j;k++)
					 {
						 System.out.print(inputArray[k]+" ");
					 }

					 System.out.println();
				 }

				 else if(sum<givenNumber)
				 {
					 continue;
				 }

				 else if(sum>givenNumber)
				 {
					 break;
				 }

			 }
		}

	}

}
