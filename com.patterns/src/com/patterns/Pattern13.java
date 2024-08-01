package com.patterns;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row no: ");
		int n = sc.nextInt();
		
		System.out.println("Enter col no: ");
		int m = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}

}
