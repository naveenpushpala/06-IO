package com.sapient.ioclasses;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadingObjects {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("c:\\employ.ser"));
		Employee e = (Employee)objectInputStream.readObject();
		System.out.println("Name :" +e.getName());
		System.out.println("Salary:" +e.getSalary());
		
	}

}
