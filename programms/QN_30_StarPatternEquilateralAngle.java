package programms;

import java.util.Scanner;

public class QN_30_StarPatternEquilateralAngle {

		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the triangle");
		int count = sc.nextInt();
		starPatternRightAngle(count);
	}
	
	public static void starPatternRightAngle(int num) {
		for(int i =0;i<num; i++) {
			
			for(int j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
	
	
	
	
	
	
}
