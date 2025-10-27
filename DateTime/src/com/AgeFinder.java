package com;

import java.time.LocalDate;
import java.time.Period;

public class AgeFinder {

	public int getAge(LocalDate dateOfBirth) {
		
		LocalDate date = LocalDate.now();
		
		Period period = Period.between(dateOfBirth, date);
		
		return period.getYears();
	}
	public LocalDate getDateAfterNDays(int noOfDays) {
		
		LocalDate date = LocalDate.now();
		
		return date.plusDays(noOfDays);
	}
	public LocalDate getDateAfterXYearYMonthZDays(int year, int month, int day) {
		
		LocalDate date = LocalDate.now();
		
		return date.plusYears(year).plusMonths(month).plusDays(day);
	}
	
	public static void main(String[] args) {
		
		AgeFinder ageFinder = new AgeFinder();
		
		LocalDate dob = LocalDate.of(1989,10,26);
		
		System.out.println("Your age is:"+ageFinder.getAge(dob));
		
		System.out.println("The date after 15 days is :"+ageFinder.getDateAfterNDays(15));
		
		System.out.println("The date after 1 year, 2 months, and 3 days is: " +
				ageFinder.getDateAfterXYearYMonthZDays(1, 2, 3));
		
	}
}
