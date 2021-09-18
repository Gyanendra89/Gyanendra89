package december.Practise;

import java.util.Arrays;

public class ArrayDoublet {



	public static void arrayDoubletFunction(int[] givenarry,int sum)
	{
		 System.out.println("Input Array : "+Arrays.toString(givenarry));

	        System.out.println("Given Number : "+sum);

	        System.out.println("Array triplets whose sum is "+sum+" are :");


		//Method 1 : Using Brute Force Method
		int length = givenarry.length;

		for(int i=0;i<length-2;i++)
		{
			for(int j=i+1;j<length-1;j++)
			{
				if(givenarry[i]+givenarry[j]==sum)
				{

					System.out.println("["+givenarry[i]+","+givenarry[j]+"]");

							//["+inputArray[i]+", "+inputArray[j]+"]

				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		arrayDoubletFunction(new int[] {7, 5, 9, 3, 0, 8, 6}, 10
				);

        System.out.println("===========================");
        arrayDoubletFunction(new int[] {-3, 7, -1, -5, 2, -9, 1}, 4);

        System.out.println("===========================");

        arrayDoubletFunction(new int[] {17, 51, 39, 29, 33, 21, 65}, 68);


	}

}
