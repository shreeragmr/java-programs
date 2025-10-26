package com;

public class EmployeeRecords {

	public static void main(String[]args) {
		
		PermanentEmployee pEmployee = new PermanentEmployee();
		ContractEmployee cEmployee = new ContractEmployee();
		
		pEmployee.setName("Anil");
		pEmployee.setEmpid(101);
		pEmployee.setBasicPay(10000);
		pEmployee.setHra(1500);
		pEmployee.setExperience(3);
		
		pEmployee.calculateSalary();
		
		cEmployee.setName("Ankit");
		cEmployee.setEmpid(102);
		cEmployee.setWage(500);
		cEmployee.setHour(10);
		
		cEmployee.calculateSalary();
	}
}
