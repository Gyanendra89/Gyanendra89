package coding.makeselenium.easy;

public class PalindromeInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		palindromeRange(10,50);

	}

	public static void palindromeRange(int start,int end)
	{      int count=0;

		for (int i=start;i<=end;i++) {
			if (ispalindrome(i)==1) {
                System.out.print(i + " ");
                count++;
			}

			}
		System.out.println("Total count is : "+count);


	}

	public static int ispalindrome(int a)
	{    int rev =0;
	     int n=a;
		while(a!=0)
		{
			rev=rev*10+a%10;
			a=a/10;
		}
		return(n == rev) ? 1 : 0;

	}

}
