package CollegeWallah;

import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter cost price : ");
		int cp = sc.nextInt();
		
		System.out.println("Enter selling price : ");
		int sp = sc.nextInt();
		
		if ( cp < sp) {
			System.out.print("Your profit is : ");
			int profit = sp - cp;
			System.out.println(profit);
		} else {
			System.out.println("Your loss is : ");
			int loss = cp - sp;
			System.out.println(loss);
		}
 	}

}
