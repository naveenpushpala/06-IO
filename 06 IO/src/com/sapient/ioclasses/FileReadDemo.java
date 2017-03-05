package com.sapient.ioclasses;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fileInputStream = new FileInputStream("c:\\Users\\HelloWorld.java");
		BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
		
		FileOutputStream fileOutputStream = new FileOutputStream("c:\\Users\\NewFIle.java");
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
		int data = bufferedInputStream.read();
		while(data !=-1)
		{
			System.out.print((char)bufferedInputStream.read());
			bufferedOutputStream.write((char) data);
			data = bufferedInputStream.read();
		}
		
		bufferedOutputStream.close();
		bufferedInputStream.close();
	}

}
