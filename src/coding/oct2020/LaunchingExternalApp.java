package coding.oct2020;

import java.io.IOException;

public class LaunchingExternalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		{
	        Runtime runtime = Runtime.getRuntime();     //getting Runtime object

	        String[] s = new String[] {"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe", "https://javaconceptoftheday.com/"};

	        try
	        {
	            runtime.exec(s);        //opens "https://javaconceptoftheday.com/" in chrome browser
	        }
	        catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	    }

	}

}
