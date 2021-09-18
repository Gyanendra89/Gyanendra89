package coding.May2021;

import java.util.Arrays;

public class MinMaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        int [] maxarray={4, 781, 8, 99, 103};
        int [] minarray={4, 781, 8, 99, 103};
       System.out.println("Maximum number from array"+Arrays.toString(maxarray) +"is:" +max(maxarray));
       System.out.println("Minimum number from array"+Arrays.toString(minarray) +"is:" +min(minarray));

       System.out.println("maximum number is :"+max(new int [] {4, 781, 8, 99, 103}));


	}
	public static int max(int[] arrNum) {
	    // assume first element of array is biggest number
	    int max = arrNum[0];

	    // loop over the array and test our above assumption
	    for(int i = 0; i < arrNum.length; i++) {
	      // if max was not the biggest number, update it
	      if(max < arrNum[i]) {
	        max = arrNum[i];
	      }
	    }

	    // after the loop max variable will hold the biggest number
	    return max;
	  }
	public static int min(int[] arrNum) {
	    // assume first element of array is the smallest number
	    int min = arrNum[0];

	    // loop over the array and test assumption
	    for(int i = 0; i < arrNum.length; i++) {
	      // if min was not smallest, update it
	      if(min > arrNum[i]) {
	        min = arrNum[i];
	      }
	    }

	    return min;
	  }

}
