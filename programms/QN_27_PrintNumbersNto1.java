package programms;

import java.util.Scanner;

public class QN_27_PrintNumbersNto1 {

	public static void main(String[] args) {
		
		printNumbers();
	}
	
	public static void printNumbers() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n value");
		
		int n = sc.nextInt();
		
		int i =n;
		
		do{
			System.out.print(i+ " ");
			i--;
		} while(i>=0);
		
		
		
	}
	
	
	
	
	
	
	
}
