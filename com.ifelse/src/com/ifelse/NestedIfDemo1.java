package com.ifelse;

import java.util.Scanner;

public class NestedIfDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your percentage: ");
		float per = sc.nextFloat();

		if (per >= 65) {
			if (per >= 80) {
				System.out.println("You can opt for both comm and science stream");
			} else {
				System.out.println("You can opt for comm stream");
			}
		} else {
			System.out.println("You are not eligible in college");
		}
	}

}
