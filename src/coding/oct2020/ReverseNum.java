package coding.oct2020;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int num = 198;
		int reversenum=0;
		System.out.println("Before reverse number"+ num);


		while(num!=0)
		{
           reversenum=reversenum*10+num%10;
			num=num/10;

		}


		System.out.println("Afte reverse number"+ reversenum);

	}

}
