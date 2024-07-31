package CollegeWallah;

import java.util.Scanner;

public class Divisible5ButNot3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		
		if (n % 5 == 0 && n % 3 != 0) {
			System.out.println(n + " is divisible by 5 but not 3");
		} else if (n % 5 == 0 && n % 3 == 0){
			System.out.println(n + " is divisible by both 5 and 3");
		} else {
			System.out.println(n + " is not divisible 5 and 3");
		}
	}

}
