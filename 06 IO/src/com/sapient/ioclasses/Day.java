package com.sapient.ioclasses;

public enum Day {

	
	SUNDAY(1),MONDAY(2),TUESDAY(3);

	Day(int i){
		this.setI(i);
		
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	private int i;

}
