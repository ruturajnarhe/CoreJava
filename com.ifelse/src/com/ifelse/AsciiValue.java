package com.ifelse;

public class AsciiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// char and int are convertable

		char ch = 'a';
		System.out.println(ch);
		System.out.println(+ch); // ascii value: add (int)

		int ascii = ch;
		System.out.println(ascii);

		int value = 48;
		char ch1 = (char) value;
		System.out.println(ch1);

		char c1 = '0';
		char c2 = '1';

		int sum = c1 + c2;
		System.out.println("sum is : " + sum);

		char sum1 = (char) (c1 + c2); // 48 + 49 = 97:a
		System.out.println(sum1);

		char ch6 = '$';
		System.out.println((int) ch6);

		int val = 195;
		System.out.println((char) val);

	}

}
