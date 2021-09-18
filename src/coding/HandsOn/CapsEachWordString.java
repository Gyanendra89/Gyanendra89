package coding.HandsOn;

public class CapsEachWordString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(capitalizeWord("gyanendra kumar pal"));

	}
	public static String capitalizeWord(String str){
	    String words[]=str.split("\\s");
	    String capitalizeWord="";
	    for(String w:words){
	        String first=w.substring(0,1);
	        String afterfirst=w.substring(1);
	        capitalizeWord+=first.toUpperCase()+afterfirst+" ";
	    }
	    return capitalizeWord.trim();
	}
}
