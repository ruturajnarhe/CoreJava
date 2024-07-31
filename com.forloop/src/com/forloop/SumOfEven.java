package com.forloop;

public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println();
		System.out.println("Sum of 20 even numbers is : " + sum);
	}

}
