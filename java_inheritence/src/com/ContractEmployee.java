package com;

public class ContractEmployee extends Employee {

	private double wage;
	private int hour;
	
	public void calculateSalary() {
		
		this.setSalary(hour*wage);
		
		System.out.println("Contract Employee: Your salary is:"+this.getSalary());
	}
	
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	
}
