package CollegeWallah;

import java.util.Scanner;

public class nNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		int num = 1;
		while (num <= n) {
			System.out.println(num);
			num ++;
		}
	}

} 
