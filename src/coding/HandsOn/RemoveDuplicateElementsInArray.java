package coding.HandsOn;

public class RemoveDuplicateElementsInArray {

	public static void main(String[] args) {
		//int arr[] = {10,20,20,30,30,40,80,80,90,90};
		int arr[] = {1,1,2,2,3,3,4,4,5,5,6,6};
        int length = arr.length;
        length = removeDuplicates(arr, length);
        //printing array elements
        for (int i=0; i<length; i++)
           System.out.print(arr[i]+" ");
    }


	public static int removeDuplicates(int []a,int n)
	{

		if(n==0||n==1)
		{
			return n;
		}
		int temp [] = new int [n];
		int j=0;

		for(int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				temp[j++] = a[i];
			}
		}

		temp[j++] = a[n - 1];

		for (int i=0; i<j; i++)
            a[i] = temp[i];

		return j;

	}

}

