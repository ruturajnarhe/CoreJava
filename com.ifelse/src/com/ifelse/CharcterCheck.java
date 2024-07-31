package com.ifelse;

import java.util.Scanner;

public class CharcterCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a character: ");
		char c = sc.next().charAt(0);

		if ((c >= 48) && (c <= 57))
			System.out.println("Its a number");
		else if ((c >= 65) && (c <= 90))
			System.out.println("Its a capital letter");
		else if ((c >= 97) && (c <= 122))
			System.out.println("Its a small letter");
		else
			System.out.println("Its a special character");

		sc.close();
	}

}
