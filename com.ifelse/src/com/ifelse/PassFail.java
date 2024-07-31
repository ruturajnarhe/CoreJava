package com.ifelse;

public class PassFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sub1 = 78.4f, sub2 = 90.4f, sub3 = 89, sub4 = 67.5f, sub5 = 89.4f;
		float per;

		per = ((sub1 + sub2 + sub3 + sub4 + sub5) / 500) * 100;

		System.out.println("You have scored:" + per);

		if (per >= 40) {
			System.out.println("Congratulations! You have cleared the exam");
		} else {
			System.out.println("Sorry! You have failed");
		}
	}

}
