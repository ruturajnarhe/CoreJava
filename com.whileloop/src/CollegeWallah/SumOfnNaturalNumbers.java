package CollegeWallah;

import java.util.Scanner;

public class SumOfnNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		int sum = 0;
		int num = 1;
		
		while (num <= n) {
			sum = sum + num;
			num ++;
		}
		System.out.println(sum);
	}

}
