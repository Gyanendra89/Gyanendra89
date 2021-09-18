package coding.testdata;

public class SwappingNUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=7;int y=8;
		System.out.println("x: "+x +"y: "+y);
		x = x+y;
		y=x-y;
		x=x-y;

		System.out.println("x: "+x +"y: "+y);
	}

}
