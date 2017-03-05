package com.sapient.ioclasses;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader FileReader = new FileReader("c:\\Users\\HelloWorld.java");
	//	BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
		
		FileWriter FileWriter=new FileWriter("c:\\Users\\NewFIle.java");
//		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
		int data = FileReader.read();
		while(data !=-1)
		{
			System.out.print((char)data);
			FileWriter.write(data);
			data = FileReader.read();
		}
		
		FileWriter.close();
		FileReader.close();
	}

}