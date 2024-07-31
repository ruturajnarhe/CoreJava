package com.forloop;

public class PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Print number 1 to 20
		for (int i = 1; i <= 20; i++) {
			System.out.println(i);
		}
		// not recommended
		int j = 0;
		for (; j <=  5;) {
			System.out.println("Welcome " + j);
			j++;
		}
	}

}
