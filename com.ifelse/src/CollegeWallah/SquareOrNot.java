package CollegeWallah;

import java.util.Scanner;

public class SquareOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length : ");
		int l = sc.nextInt();
		
		System.out.println("Enter breadth : ");
		int b = sc.nextInt();
		
		if (l == b) {
			System.out.println("This is square");
		} else {
			System.out.println("This is not square");
		}
	}

}
