package december.Practise;

public class GetTwoMaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int list[] = { 15, 24, 48, 21, 43, 81, 79, 93 };
		twoMaxNumInarray(list);


	}

	public static void twoMaxNumInarray(int [] inputArray)
	{
		int maxOne=0;
		int maxTwo=0;


		for(int n : inputArray)
		{
			if(maxOne<n)
			{
				maxTwo=maxOne;
				maxOne=n;
			}
			else if(maxTwo<n)
			{
				maxTwo=n;
			}

		}
		System.out.println("Max1 - " + maxOne);
		System.out.println("Max2 - " + maxTwo);
	}

}
