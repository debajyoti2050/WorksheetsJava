package com.cognizant.inheritance;

class Employee {
	long employeeId;
	String employeeName;
	String employeeAddress;
	Long employeePhone;
	double basicSalary;
	double speacialAllowance=250.80;
	double Hra=1000.50;
	
	Employee(long Id,String Name,String Address,long phone){
		this.employeeId=Id;
		this.employeeName=Name;
		this.employeeAddress=Address;
		this.employeePhone=phone;
	}
	
	double calculateSalary() {
		double salary;
		salary=basicSalary+(basicSalary*speacialAllowance/100)+(basicSalary*Hra/100);
		return salary;
	}

}
