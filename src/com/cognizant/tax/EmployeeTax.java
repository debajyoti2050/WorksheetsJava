package com.cognizant.tax;

class EmployeeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test Case 1 : \n");
		TaxCalculator ob1 = new TaxCalculator();
		ob1.basicSalary = 25000;
		ob1.citizenship = false;
		ob1.calculateTax();
		ob1.deductTax();
		ob1.validateSalary();
		System.out.println("\nTest Case 2 : \n");
		TaxCalculator ob2 = new TaxCalculator();
		ob2.basicSalary = 125000;
		ob2.citizenship = true;
		ob2.calculateTax();
		ob2.deductTax();
		ob2.validateSalary();

	}

}
