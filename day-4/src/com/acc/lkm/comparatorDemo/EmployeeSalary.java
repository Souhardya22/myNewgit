package com.acc.lkm.comparatorDemo;

import java.util.Comparator;

public class EmployeeSalary implements Comparator<EmployeeSalary>{
	public EmployeeSalary(int eID, String name, double salary) {
		super();
		EID = eID;
		this.name = name;
		this.salary = salary;
	}
	int EID;
	String name;
	double salary;
	@Override
	public int compare(EmployeeSalary emp1, EmployeeSalary emp2) {
		EmployeeSalary employeeSalary=(EmployeeSalary)emp1;
		EmployeeSalary employeeSalary2=(EmployeeSalary)emp2;
		//when we are sorting the employees based on descending order of their salary
		if(employeeSalary.salary<employeeSalary2.salary) {
			return 1; //will swap
		}
		else if(employeeSalary.salary>employeeSalary2.salary) {
			return -1; //will not swap
		}
		else {
			return 0;
		}
	}

}
