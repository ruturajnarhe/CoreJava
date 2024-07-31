package CollegeWallah;

import java.util.Scanner;

public class SidesOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st side : ");
		int a = sc.nextInt();
				System.out.println("Enter 2nd side : ");
		int b = sc.nextInt();
				System.out.println("Enter 3rd side : ");
		int c = sc.nextInt();
		
		if (a + b > c && b + c > a && a + c > b) {
			System.out.println("a, b and c are the sides of triangle");
		} else {
			System.out.println("a, b and c are not the sides of triangle");
		}
	}

}
 