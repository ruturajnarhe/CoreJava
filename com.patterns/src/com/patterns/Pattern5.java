package com.patterns;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		
		for (int i = 1; i <= n; i++) {
			     // Space print
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			    // star print
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
