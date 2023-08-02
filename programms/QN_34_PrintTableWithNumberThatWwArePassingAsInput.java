package programms;

import java.util.Scanner;

public class QN_34_PrintTableWithNumberThatWwArePassingAsInput {

	
	public static void main(String[] args) {
		
		table();
		    
		}

	public static void table() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table of :");
		int tableNum = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the table size :");
		int tableSize = sc.nextInt();
		
		System.out.println("Table of "+tableNum+ " :");
		for(int i =1; i<=tableSize;i++) {
			
			System.out.println(tableNum + " * "+i + " = " + (tableNum*i));
			
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	}
	
	

