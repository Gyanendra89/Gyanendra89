
package coding.july2020;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(recursiveMethod(str));
		
	}
		
		static String str = "MyJava";
		 static String recursiveMethod(String str)
		    {
		         if ((null == str) || (str.length() <= 1))
		         {
		                return str;
		         }
		 
		         return recursiveMethod(str.substring(1)) + str.charAt(0);
		    }
		

		
}	

	
	
	

 