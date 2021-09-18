package coding.May2021;

public class SecondLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] b={2,4,8,5,7,1,6};

		int c=secondLargest(b, 7);


		//int b=secondLargest( new int[] {2,4,3,5,6,1,6},7);
		System.out.println(c);

	}

	public static int secondLargest(int [] a,int length)
	{
		//int length = a.length;
		 for(int i=0;i<length;i++)
		 {
			 for(int j=i+1;j<length;j++)
			 {
				 if(a[i]>a[j])
				 {
					 int temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
			 }
		 }
		return length-1;
	}
}


