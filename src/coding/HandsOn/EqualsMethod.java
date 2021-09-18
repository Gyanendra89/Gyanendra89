package coding.HandsOn;

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String("TUTORIALSPOINT");
	      String s2 = new String("TUTORIALSPOINT");
	      //Reference comparison
	      System.out.println(s1 == s2);
	      //Content comparison
	      System.out.println(s1.equals(s2));
	      // integer-type
	      System.out.println(10 == 10);
	      // char-type
	      System.out.println('a' == 'a');

	}

}
