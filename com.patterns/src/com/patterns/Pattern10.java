package com.patterns;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;

		// upper part
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			int spaces = 2 * (n - i);
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// lower part
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			int spaces = 2 * (n - i);
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
