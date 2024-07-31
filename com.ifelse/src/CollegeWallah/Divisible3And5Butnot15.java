package CollegeWallah;

import java.util.Scanner;

public class Divisible3And5Butnot15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
//		if (n%5==0 || n%3==0) {
//			if (n%15!=0) {
//				System.out.println("Number is divisible by 3 or 5 but not 15");
//			} else {
//				System.out.println("Not matching the required condition");
//			} 
//		} else {
//			System.out.println("Not matching the required condition");
//		}
		
		if ((n%5==0 || n%3==0) && n%15!=0) {
			System.out.println("Number is divisible by 3 or 5 but not 15");
		} else {
			System.out.println("Not matching the required condition");
		} 
	}

}
