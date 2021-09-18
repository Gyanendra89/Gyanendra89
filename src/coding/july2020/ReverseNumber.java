package coding.july2020;

public class ReverseNumber {

	//private static int number;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNumber rnum = new ReverseNumber();

		//int reversenumber = rnum.reversenum(56789);
		System.out.println("Reverse of num is   " +reversenum(78));

	}
	public static int reversenum(int number)
	{


		int temp=0;
		while(number!=0)
		{
			temp = temp*10 + number%10;
			number=number/10;
		}
		return temp;
	}

}
