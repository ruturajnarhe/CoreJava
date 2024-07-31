package JavaInpute;

import java.util.Scanner;

public class AreaOfCircleWithInpute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a radius: ");
		double r = sc.nextDouble();
		
		double pi = 3.1415;
		
		double area = pi * r * r;
		System.out.println("The area of circle: " + area);
	}

}
