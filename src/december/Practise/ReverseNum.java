package december.Practise;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		reverseNumber(63);
		reverseNumber(64);


	}

	public static void reverseNumber(int num)
	{
		int rev=0;
		int number=num;
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num=num/10;
		}

		System.out.println("Reverse of "+ number + "is" + rev);

		if(number==rev)
		{
			System.out.println("palindrome");
		}
		else
			System.out.println("Not palindrome");
	}

}
