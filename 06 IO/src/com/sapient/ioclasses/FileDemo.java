package com.sapient.ioclasses;
import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException, MyException {

		File file = new File("C:\\Users\\krishna\\Pictures");
		file.createNewFile();
	//	file.delete();
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		
		String[] fileNames = file.list();
		
		/*for (int i = 0; i < fileNames.length; i++) {
			System.out.println(fileNames[i]);
		}*/
		
		
				displayFilesInDirectory(file);
		}

	/*	if(!file.exists()){
			file.mkdirs();
		}
		*/
	public static void displayFilesInDirectory(File directoryPath) throws MyException{

		File [] filesinDirectory=directoryPath.listFiles();
		
		for (File file : filesinDirectory) {
			
			MyException e = new MyException(file , "this file is null");
			if(file.isDirectory() && (file != null))
			{
				displayFilesInDirectory(file);	
			}
			else if(file.isFile() &&(file != null))
				System.out.println(file.getAbsoluteFile());
			else
				throw e;
		
		}
		
		
		
	}


}
