package com.forloop;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		int num = sc.nextInt();
		
		long fact = 1;
		
		for(int i = 1; i <= num; i++) {
			fact *= i;
			System.out.println(fact);
		}
		System.out.println("Factorial of " + num + " is: " + fact);
		
		fact = 1;
		for (int i = num; i > 0; i--) {
			fact *= i;
			System.out.println(fact);
		}
		System.out.println("Factorial of " + num + " is: " + fact);
	}

}
