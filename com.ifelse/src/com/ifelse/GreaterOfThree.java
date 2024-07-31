package com.ifelse;

import java.util.Scanner;

public class GreaterOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		if (num1 > num2) {
			if (num1 > num3)
				System.out.println("Gretest no " + num1);
			else
				System.out.println("Gretest no " + num3);
		} else {
			if (num2 > num3)
				System.out.println("Gretest no " + num2);
			else
				System.out.println("Gretest no " + num3);
		}

		/////// 2nd way

		if ((num1 > num2) && (num1 > num3))

			System.out.println("Greatest no :" + num1);

		else if (num2 > num3)
			System.out.println("Greatest no :" + num2);
		else
			System.out.println("Greatest no :" + num3);
	}

}
