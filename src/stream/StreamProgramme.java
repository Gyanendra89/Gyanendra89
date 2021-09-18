package stream;

import java.util.ArrayList;

public class StreamProgramme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> arrlst=new ArrayList<String>();

arrlst.add("Abram");
arrlst.add("Gdyasha");
arrlst.add("Gyan");
arrlst.add("Abdin");
arrlst.add("jinu");

Long nolistwithA=arrlst.stream().filter(s->s.startsWith("Gd")).count();
System.out.println(nolistwithA);


	}

}
