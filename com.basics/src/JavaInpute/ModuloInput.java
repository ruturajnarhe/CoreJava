package JavaInpute;

import java.util.Scanner;

public class ModuloInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter divident : ");
		int a = sc.nextInt();
		
		System.out.println("Enter Divisor : ");
		int b = sc.nextInt();
		
		int r = a % b; // % use for remainder 
		System.out.println("The remainder when " + a + " is divided by " + b + " is " + r);
	}

}
