package com.locateALocum.techTest.httpRequests;

public class NumberAdditionResponse {
	
	int number1;
	int number2;
	int total;
	
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		this.total = getNumber1() + getNumber2();
	}
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	
	
}
