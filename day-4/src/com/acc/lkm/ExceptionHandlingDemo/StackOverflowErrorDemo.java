package com.acc.lkm.ExceptionHandlingDemo;

public class StackOverflowErrorDemo {
	static int i = 0;

	public static int printNumber(int i) {
		i += 2;
		if (i <= 20) {
			System.out.println(i);
		}
//		return i + printNumber(i + 2);
		return i + printNumber(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			StackOverflowErrorDemo.printNumber(i);
		} catch (StackOverflowError e) {
			System.out.println("Stack Overflow Exception happens");
		}

	}

}
