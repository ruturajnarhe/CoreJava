package CollegeWallah;

import java.util.Scanner;

public class DivisibleBy5Or3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		if (n % 5 == 0 || n % 3 == 0) { // ||  -> logical or
			System.out.println(n + " is divisible 5 or 3");
		} else {
			System.out.println(n + " is not divisible 5 or 3");
		}
	}

} 
