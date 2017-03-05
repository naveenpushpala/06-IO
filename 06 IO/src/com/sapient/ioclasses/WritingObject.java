package com.sapient.ioclasses;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritingObject {

	public static void main(String[] args) throws IOException {

		Employee e = new Employee();
		e.setEmployeeId(23233);
		e.setName("skdfskdf");
		e.setSalary(123);
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("c:\\employ.ser"));
		objectOutputStream.writeObject(e);
		objectOutputStream.close();
	}

}
