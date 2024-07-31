package com.basics;

public class ShortHand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte num = 8;

		num = (byte) (num + 8);
		System.out.println(num);

		num += 8;

		byte b1 = 89;
		// b1 = b1 + 8;

		b1 += 8;
		System.out.println(b1);

		byte b2 = 90;
		byte b3 = 7;

		// b2 = (byte) (b2 + b3);

		b2 += b3;

		byte sum;
		// sum = b2 + b3;

		// +=, -=, /=, *=
	}

}
