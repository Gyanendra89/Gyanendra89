package coding.makeselenium.easy;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=895;
		int rev=0;
		System.out.println(" Befor Reverse num is  "+num);

		while(num !=0)
		{
			rev = rev*10 + num%10;
			num=num/10;

		}

		System.out.println(" After Reverse num is  "+rev);

	}

}
