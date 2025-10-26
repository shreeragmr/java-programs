package com;

public class PermanentEmployee extends Employee{

	private double basicPay;
	private double hra;
	private int experience;
	
	public void calculateSalary() {
		
		double variableComponent = 0;
		
		if(experience < 3) {
			variableComponent = 0;
		}
		else if(experience>=3 && experience<5) {
			variableComponent = (this.getBasicPay())*5/100;
		}
		else if(experience>=5 && experience<10) {
			variableComponent = (this.getBasicPay())*7/100;
		}
		else if(experience>=10) {
			variableComponent = (this.getBasicPay())*12/100;
		}
		
		this.setSalary(variableComponent + hra + basicPay);
		System.out.println("Permanent Employee: Your salary is:"+this.getSalary());
	}
	
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	
	
}
