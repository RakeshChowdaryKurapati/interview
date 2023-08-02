package programms;

import java.util.Scanner;

public class QN_26_PrintNnumbersUsingWhileLoop {
	
	public static void main(String[] args) {
		printNnumbers();
	}
	
	public static void printNnumbers() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the n value  ");
		
		int countOfN = sc.nextInt();
				
		int i =0;
		
		while(i<=countOfN) {
			
			System.out.print(i+" ");
			
			i++;
		}
		
	}

}
