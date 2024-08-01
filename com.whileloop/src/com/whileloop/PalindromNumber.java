package com.whileloop;

import java.util.Scanner;

public class PalindromNumber {

	public void findRevers(int num) {
		int rev = 0;
		while (num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		System.out.println(rev);
	}

	public boolean checkPalindrom(int num) {
		int rev = 0;
		int temp = num;
		while (num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		if (temp == rev) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number : ");
		int num = sc.nextInt();

		PalindromNumber palin = new PalindromNumber();
		// palin.findRevers (num);
		boolean isPalindrom = palin.checkPalindrom(num);

		if (isPalindrom) {
			System.out.println("Number is Palindrom");
		} else {
			System.out.println("Number is not Palindrom");
		}
	}

}
