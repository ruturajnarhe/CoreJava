package CollegeWallah;

import java.util.Scanner;

public class AreaPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length : ");
		int l = sc.nextInt();
		
		System.out.println("Enter breadth : ");
		int b = sc.nextInt();
		
		int a = l * b;
		int p = 2 * (l + b);
		
		if (a > p) {
			System.out.println("Area of rectangle is greater than its perimeter");
		} else {
			System.out.println("Perimeter of rectangle is greater than its area");
		}
	}

}
