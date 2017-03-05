package com.sapient.ioclasses;
import java.io.Serializable;

public class Employee implements Serializable {
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 8275924308472183046L;
	private int employeeId;
	private String Name;
	private transient int salary;
	private String City;
	/*private transient Address address;
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	*/
	
	public void doSomeWork(Day day){
	
		switch(day){
		case SUNDAY:
			
				break;
			
		case MONDAY:
			
				break;
			
		case TUESDAY:
			
				break;
		
		default:
				break;
		
		
		}
		
		
	}
	
	
	
	
	
	
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
