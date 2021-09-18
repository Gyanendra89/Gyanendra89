package coding.May2021;

public class ReverseWordInSentense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


    System.out.println(reverse("Gyanendra kumar pal"));
    System.out.println(reverse("I love my india"));
	}


	public static String reverse(String str)
	{

		String[] temp=str.split(" ");
		String result="";

		for(int i=0;i<temp.length;i++)
		{
			if(i==temp.length-1)
			{
				result=temp[i]+result;
			}
			else
				result=" "+temp[i]+result;
		}
		return result;



	}
}
