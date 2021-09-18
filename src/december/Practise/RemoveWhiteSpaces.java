package december.Practise;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		removeWhiteSpaces("Gyanendra Kumar Pal");
		removeWhiteSpaces("Ariket   pal");

	}

	public static void removeWhiteSpaces(String str)
	{
		char [] chararray = str.toCharArray();
		String reverse = "";

		for(int i=0;i<chararray.length;i++)
		{
			if((chararray[i] !=' ')&&(chararray[i] !='\t'))
			{
				reverse = reverse + chararray[i];
			}

		}



		System.out.println("After removing white spaces from "  +str+" is: "+reverse);
	}

}
