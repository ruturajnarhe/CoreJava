package com.whileloop;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = 0; 
		int sum = 0;
		
		do {
			System.out.println("Enter any number : ");
			num = sc.nextInt();
			sum += num;
		} while (num != 0);
		System.out.println("Sum is : " + sum);
	}

}
