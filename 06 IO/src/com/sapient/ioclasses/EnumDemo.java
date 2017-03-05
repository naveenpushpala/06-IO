package com.sapient.ioclasses;

public class EnumDemo {

	public static void main(String[] args) {
		
//		System.out.println(Day.MONDAY);
		
		Day[] days = Day.values();
		
		for (Day day : days) {
			
			System.out.println(day);
		}
		
		
		
		
	}
}
