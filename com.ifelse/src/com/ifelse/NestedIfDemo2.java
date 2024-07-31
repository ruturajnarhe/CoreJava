package com.ifelse;

import java.util.Scanner;

public class NestedIfDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age: ");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("Enter your weight: ");
			float wt = sc.nextFloat();

			if (wt >= 50) {
				System.out.println("You can donate blood");
			} else {
				System.out.println("You cannot donate blood because you are underweight");
			}
		} else {
			System.out.println("You are too young to donate blood");
		}
	}

}
