package coding.May2021;

import java.util.Arrays;

public class SecondMaxMInInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(secMin(new int []{4, 781, 8, 99,9, 103}));
		System.out.println(secMax(new int []{4, 781, 8, 99, 103,104}));


	}

	public static int secMax(int[] numArr) {
	    // sort an array
	    Arrays.sort(numArr);

	    // return one before last. Array is soreted from smallest to biggest
	    return numArr[numArr.length - 2];
	  }
	public static int secMin(int[] numArr) {
	    // sort an array
	    Arrays.sort(numArr);

	    // return second element. Array is soreted from smallest to biggest
	    return numArr[1];
	  }


}
