package com.forloop;

import java.util.Scanner;

public class TableNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "X" + i + "=" + (num * i));
		}
	}

}
