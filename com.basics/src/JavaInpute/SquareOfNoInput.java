package JavaInpute;

import java.util.Scanner;

public class SquareOfNoInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		
		int sq = n * n;
		System.out.println("The square is : " + sq);
	}

}
