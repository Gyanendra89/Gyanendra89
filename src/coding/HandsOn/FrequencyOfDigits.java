
package coding.HandsOn;

import java.util.HashMap;
import java.util.Set;

public class FrequencyOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frequencyOfDigits(456);
		frequencyOfDigits(1111778899);
		frequencyOfDigits(001);

	}

	public static void frequencyOfDigits(long number)
	{
		HashMap<Long,Integer> countDigit = new HashMap<Long,Integer>();

		while(number !=0)
		{
			long lastdigit = number % 10;

			if(countDigit.containsKey(lastdigit))
			{
				countDigit.put(lastdigit, countDigit.get(lastdigit)+1);
			}
			else
			{
				countDigit.put(lastdigit, 1);
			}

			number = number/10;
		}

			Set<Long> keys = countDigit.keySet();

			for(Long key : keys)
			{
				System.out.println(" "+key+ ":"+countDigit.get(key));
			}

			System.out.println("--------------------------");

		//System.out.println(countDigit);
	}

}
