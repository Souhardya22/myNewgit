package com.acc.lkm.comparableDemo;

import java.lang.Comparable;

public class EmployeeName implements Comparable<EmployeeName>{
	public EmployeeName(String name) {
		super();
		this.name = name;
	}
	String name;
	public String getName() {
		return name;
	}
	
	public int compareTo(EmployeeName empname) {
		return this.name.compareTo(empname.getName());
	}
	
	public String toString() {
		return name;
	}
}
