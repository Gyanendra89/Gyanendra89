package coding.HandsOn;

public class SplitNumericFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "abcd1234";
		String st1=st.replaceAll("[^A-Za-z]", "");
		//String st2=st.replaceAll("[^0-9]", "");
		System.out.println("String b = "+st1);
		//System.out.println("Int c = "+st2);

		/*
		 * System.out.println("==========================="); String str = "abcd1234";
		 * String[] part = str.split("(?<=\\D)(?=\\d)"); System.out.println(part[0]);
		 * System.out.println(part[1]);
		 */


	}

}
