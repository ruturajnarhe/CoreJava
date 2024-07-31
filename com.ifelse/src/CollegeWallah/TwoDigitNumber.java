package CollegeWallah;

import java.util.Scanner;

public class TwoDigitNumber { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		if (n > 9 && n < 100) {
			System.out.println("This is two digit number");
		} else {
			System.out.println("This is not a two digit number");
		}
	}

}
