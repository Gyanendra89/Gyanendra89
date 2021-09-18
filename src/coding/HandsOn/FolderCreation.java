package coding.HandsOn;

import java.io.File;
import java.util.Date;

public class FolderCreation {

	public static void CreateFolder(String path)  {

		//File is a class inside java.io package

		File file = new File(path);

		if (!file.exists()) {

			file.mkdir();//mkdir is used to create folder


		} else

			System.out.println("Folder already created");

	}


	public static String Timestamp() {

		Date now = new Date();

		String Timestamp = now.toString().replace(":", "-");

		return Timestamp;


	}

	public static void main(String[] args)
	{
		String subfolderpath=System.getProperty("user.dir")+"/htmlReports/"+Timestamp();
		System.out.println(subfolderpath);
		CreateFolder(subfolderpath);
	}

}
