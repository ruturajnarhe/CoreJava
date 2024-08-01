package com.whileloop;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		
		while (num != 0) {
			System.out.println("Enter any number : ");
			num = sc.nextInt();
			sum += num;
		}
		System.out.println("Sum is : " + sum);
	}

}
