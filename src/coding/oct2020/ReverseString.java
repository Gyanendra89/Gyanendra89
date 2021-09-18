package coding.oct2020;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String beforereverse = "Gyanendra is automation specialist";

		String afterreverse = "";

		for(int i=beforereverse.length()-1;i>=0;i--)
		{
			afterreverse =afterreverse + beforereverse.charAt(i);
		}
       System.out.println("After reverse  "+ afterreverse);
	}

}
