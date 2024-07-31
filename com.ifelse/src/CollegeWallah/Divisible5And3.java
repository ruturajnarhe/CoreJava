package CollegeWallah;

import java.util.Scanner;

public class Divisible5And3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		
		if (n % 5 == 0 && n % 3 == 0) {
			System.out.println(n + " divisible by either 5 and 3");
		} else {
			System.out.println(n + " not divisible by either  5 and 3");
		}
	}

}
