package CollegeWallah;

import java.util.Scanner;

public class PointLiesOnAxis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter value of x : ");
		int x = sc.nextInt();
		
		System.out.println("Enter value of y : ");
		int y = sc.nextInt();
		
		if (x==0 && y==0) {
			System.out.println("The point is in origin");
		} else if (x==0) {
			System.out.println("The point lies in y-axis");	
		} else if (y==0) {
				System.out.println("The point lies in x-axis ");
		} else {
			System.out.println("Not matching the required conditions");
		}
	}

}
