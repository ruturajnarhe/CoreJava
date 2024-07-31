package CollegeWallah;

import java.util.Scanner;
 
public class ThreeDigitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		
		if (n > 99 && n < 1000) {
			System.out.println("Number is three digit");
		} else {
			System.out.println("Number is not three digit");
		}
	}
}
