package coding.dec2020;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CountOfDigitFreqInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number :");
		int inputNumber = sc.nextInt();

		HashMap<Integer, Integer> countofdigit = new HashMap<Integer, Integer>();

		while(inputNumber !=0)
		{
			int lastdigit = inputNumber%10;

			if(countofdigit.containsKey(lastdigit))
			{
				countofdigit.put(lastdigit, countofdigit.get(lastdigit)+1);
			}
			else {
				countofdigit.put(lastdigit, 1);
			}

			inputNumber=inputNumber/10;
		}
		System.out.println("===================");

        System.out.println("Digits : Frequency");

        System.out.println("===================");
        System.out.println("printing"+countofdigit);

        Set<Integer> keys = countofdigit.keySet();

        for (Integer key : keys)
        {
            System.out.println("   "+key+"   :   "+countofdigit.get(key));
        }

        sc.close();



	}



}
