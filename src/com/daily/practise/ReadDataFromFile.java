package com.daily.practise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileReader fr = new FileReader("D:\\TestData\\Cowindata.txt");

BufferedReader bf = new BufferedReader(fr);
  String str;

  while((str = bf.readLine())!=null)
  {
	System.out.println(str);
  }
  bf.close();
System.out.println("----other approach----------------");
  //Approach 2

  File file = new File("D:\\TestData\\Cowindata.txt");
  Scanner sc = new Scanner(file);
//  while(sc.hasNextLine())
//  {
//	  System.out.println(sc.nextLine());
//  }
  System.out.println("----other approach3----------------");

  sc.useDelimiter("\\Z");
  System.out.println(sc.next());







	}

}
