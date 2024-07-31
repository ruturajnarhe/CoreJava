package CollegeWallah;

import java.util.Scanner;

public class FindEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a No : ");
		int n = sc.nextInt();
		
		if (n % 2 == 0) { // no even hai
			System.out.println("No is Even");
		} else { //  no odd hai
			System.out.println("No is Odd");
		}
	}
 
}

  // = assign
  // == comparison 
