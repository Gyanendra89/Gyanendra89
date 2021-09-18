package coding.makeselenium.easy;

public class RemoveWhiteSpacesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		removeWhiteSpacesFromString("Gyanendra Kumar   Pal");

	}

	public static void removeWhiteSpacesFromString(String str)
	{

		char [] strToChararray = str.toCharArray();
		String withoutspace ="";
		for(int i=0;i<strToChararray.length;i++)
		{
			if((strToChararray[i] !=' ') && (strToChararray[i] !='\t'))
			{
				withoutspace = withoutspace + strToChararray[i];


			}
		}

		System.out.println("String with space :"+str);
		System.out.println("String without space :"+withoutspace);

	}

}
