package coding.makeselenium.easy;

import java.util.Scanner;

public class PrimeNoInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no :");
		int start = sc.nextInt();
		System.out.println("Enter last no :");
		int end = sc.nextInt();
		System.out.println("List of prime number between "+ start +" and "+end);
		 for (int i = start; i <= end; i++) {
	           if (isPrime(i)) {
	        	   count++;
	               System.out.print(i+ " " );
	           }


	       }
		 System.out.println("Total no of prime number :" +count);

	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;

		}

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;

			}

		}

		return true;
	}
}
