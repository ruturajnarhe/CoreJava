package JavaInpute;

import java.util.Scanner;

public class SumOf2NumbersInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a first No : ");
		double n = sc.nextDouble();
		
		System.out.println("Enter a Second No : ");
		double m = sc.nextDouble();
		
		double sum = n + m;
		System.out.println("The sum is : " + sum);   
		
		
	}

}
