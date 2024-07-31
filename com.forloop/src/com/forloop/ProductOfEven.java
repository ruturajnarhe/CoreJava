package com.forloop;

public class ProductOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long prod = 1;
		
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				// System.out.println(i + "+");
				prod *= i;
			}
		}
		System.out.println("Product of 20 even numbers is: " + prod);
	}

}
