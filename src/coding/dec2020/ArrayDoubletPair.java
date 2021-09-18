package coding.dec2020;

public class ArrayDoubletPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//arraydoublet(new int[] {4,5,6,7,8},12);
		arraydoublet(new int[] {4,5,4,7,8,0},8);

	}

	public static void arraydoublet(int [] givenarray,int num)

	{

		//System.out.println("Given array is "+ givenarray.toString());

		int length = givenarray.length;

		for(int i=0;i<length-1;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(givenarray[i]+ givenarray[j]==num)
				{
					System.out.println("["+givenarray[i]+","+givenarray[j]+"]");
				}
			}
		}
	}

}
