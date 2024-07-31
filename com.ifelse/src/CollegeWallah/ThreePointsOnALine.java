package CollegeWallah;

import java.util.Scanner;

public class ThreePointsOnALine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter vakue of x1 : ");
		double x1 = sc.nextDouble();
		System.out.println("Enter vakue of x2 : ");
		double x2 = sc.nextDouble();
		System.out.println("Enter vakue of x3 : ");
		double x3 = sc.nextDouble();
		System.out.println("Enter vakue of y1 : ");
		double y1 = sc.nextDouble();
		System.out.println("Enter vakue of y2 : ");
		double y2 = sc.nextDouble();
		System.out.println("Enter vakue of y3 : ");
		double y3 = sc.nextDouble();
		
		double m1 = (y2-y1)/(x2-x1);
		double m2 = (y3-y2)/(x3-x2);
		
		if (m1 == m2) {
			System.out.println("The three points lie on a single line");
		} else {
			System.out.println("They do not lie on a single line");
		}
	}

}
