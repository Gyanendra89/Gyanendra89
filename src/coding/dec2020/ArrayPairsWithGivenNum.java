package coding.dec2020;

import java.util.Arrays;

public class ArrayPairsWithGivenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arraypairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);

		arraypairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);

		arraypairs(new int[] {12, 13, 40, 15, 8, 10, -15}, 25);

		arraypairs(new int[] {12, 23, 125, 41, -75, 38, 27, 11}, 50);

	}

	static void arraypairs(int [] inputarray,int num)
	{
		System.out.println("Given array is :"+Arrays.toString(inputarray)+ " with " + num);

		for(int i=0;i<inputarray.length;i++)
		{
			for(int j=i+1;j<inputarray.length;j++)
			{
				if(inputarray[i]+inputarray[j]==num)
				{
					System.out.println(inputarray[i]+" + "+inputarray[j]+" = "+num);
				}
			}
		}
		System.out.println("======================================");

	}

}
