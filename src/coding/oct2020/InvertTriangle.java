package coding.oct2020;

import java.util.Scanner;

public class InvertTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num want to see reverse:=");
		int num = sc.nextInt();
		while (num>0)
		{
			for(int j=1;j<=num;j++)
			{
				System.out.print(" "+ num + " ");
			}
			System.out.println("\n");
			num--;
		}

	}

}
