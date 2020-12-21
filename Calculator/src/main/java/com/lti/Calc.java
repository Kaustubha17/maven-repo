package com.lti;

public class Calc {

	public static int add(int num1,int num2) {
		return num1+num2;
	}
	public static int diff(int num1,int num2) {
		return num1-num2;
	}
	public static void main(String[] args) {
		
		System.out.println("Sum= "+add(23,23));
		System.out.println("diff= "+diff(23,23));
	}

}
