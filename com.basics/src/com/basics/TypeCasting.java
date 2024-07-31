package com.basics;

//Comments

//Widening: small to big (automatic)
//e.g: int -> float

//Narrowing: big to small 
//e.g: byte -> int

//All numbers - int 
//with dceimal - double

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f1 = 67.5f;
		float f2 = (float) 78.6;
		System.out.println(f1);
		System.out.println(f2);

		float n1 = 67, n2 = 89;
		int sum;

		sum = (int) (n1 + n2);

		System.out.println("Sum is:" + sum);

		// all arithmetic opr min: int

		byte b1 = 67, b2 = 23;

		byte sum1 = (byte) (b1 + b2);

		System.out.println(sum1);

		short s1 = 89;
		short s2 = 56;

		short diff = (short) (s1 - s2);

		int diff1 = s1 - s2;

		int num1 = 90, num2 = 40;

		float sum2 = num1 + num2; // automatically : widening
	}

}
