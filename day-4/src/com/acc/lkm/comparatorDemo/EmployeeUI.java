package com.acc.lkm.comparatorDemo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<EmployeeSalary>empList=new ArrayList<EmployeeSalary>();
		empList.add(new EmployeeSalary(12,"Cyril",80000.00));
		empList.add(new EmployeeSalary(17,"Peter",56000.00));
		empList.add(new EmployeeSalary(10,"John",92000.00));
		empList.add(new EmployeeSalary(10,"John2",99999.00));
		empList.add(new EmployeeSalary(10,"John3",92135.00));
		empList.add(new EmployeeSalary(10,"John4",92046.00));
		empList.add(new EmployeeSalary(10,"John5",92034.00));
		empList.add(new EmployeeSalary(10,"John6",92003.00));
		//For Comparator
		System.out.println("");
		Collections.sort(empList,new EmployeeSalary(0,null,0.00));
		for(EmployeeSalary empSalary:empList) {
			System.out.println("Employee ID: "+empSalary.EID+"\nName: "+empSalary.name+"\nSalary"+empSalary.salary);
		}
	}

}
