package com.ifelse;

import java.util.Scanner;

public class WordsWithB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String input = sc.nextLine();
		
		String[] words = input.split("\\s+");
		
		System.out.println("Words starting with 'B' or 'b' : ");
		for (String word : words) {
			if (word.startsWith("B") || word.startsWith("b")) {
				System.out.println(word + " ");
			}
		}
		sc.close();
	}

}
