package CollegeWallah;

import java.util.Scanner;

public class YoungestOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age of Ram : ");
		int r = sc.nextInt();
		
		System.out.println("Enter age of Shyam : ");
		int s = sc.nextInt();
		
		System.out.println("Enter age of Ajay : ");
		int a = sc.nextInt();
		
		if (r > s && r > a) {
			System.out.println("Ram is youngest");
		} else if (s > r && s > a) {
			System.out.println("Shyam is youngest");
		} else {
			System.out.println("Ajay is youngest");
		}
	}

}
