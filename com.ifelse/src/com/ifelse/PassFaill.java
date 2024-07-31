package com.ifelse;

import java.util.Scanner;

public class PassFaill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		String Name = sc.next();
		
		System.out.println("Enter marks of subject 1:");
		float sub1 = sc.nextFloat();
		
		System.out.println("Enter marks of subject 2:");
		float sub2 = sc.nextFloat();
		
		System.out.println("Enter marks of subject 3:");
		float sub3 = sc.nextFloat();
		
		System.out.println("Enter marks of subject 4:");
		float sub4 = sc.nextFloat();
		
		System.out.println("Enter marks of subject 5:");
		float sub5 = sc.nextFloat();
		
		float per = ((sub1 + sub2 + sub3 + sub4 +sub5)/500)*100;
		
		System.out.println(Name + " has scored: " + per + "%");
		
		if (per >= 40) {
			System.out.println("Congratulations! You have cleared the exam");
		} else {
			System.out.println("Sorry! You have failed");
		}
		sc.close();
	}

}
