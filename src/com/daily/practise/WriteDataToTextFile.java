package com.daily.practise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter fr = new FileWriter("D:\\TestData\\WritingData.txt");
		BufferedWriter bfr = new BufferedWriter(fr);
		bfr.write("Gyanendra kumar pal");
		bfr.write("Ariket pal");
		bfr.write("Aparajita pal");

		System.out.println("Finished");

		bfr.close();

	}

}
