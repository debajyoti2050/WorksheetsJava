package com.cognizant.tax;


class TaxCalculator {

	float basicSalary;
	boolean citizenship;
	float tax;
	
	void calculateTax() {
		
		tax = 30*basicSalary/100;
		System.out.println("The tax of the employee for the " + basicSalary + " is " + tax);
	}
	
	
	float nettSalary;
	void deductTax() {
		nettSalary = (int)(basicSalary - tax);
		System.out.println("The nett salary of the employee is " + nettSalary);
	}
	
	void validateSalary() {
		if (basicSalary > 100000 && citizenship == true)
			System.out.println("The salary and citizenship eligibility: " + citizenship);
		else
			System.out.println("The salary and citizenship eligibility: " + citizenship);
		
	}
}
