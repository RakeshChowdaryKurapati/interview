package programms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QN_25_AcceptThreeNumbersFromUserAndPrintThemInAscendingAndDescendingOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("How many numbers you wanted to give");

		int count = sc.nextInt();

		System.out.println("Continue..........");

		orderOfNumbers(count);

	}


	public static void orderOfNumbers(int countOfUserDefinedNumber) {
		Double[] ob = new Double[countOfUserDefinedNumber];
		for(int i=0;i<countOfUserDefinedNumber;i++) {
			ob[i] = numberChecker();
		}

		Arrays.sort(ob);
//		System.out.print("Ascending Order of three numbers  ");
//		boolean flag;
//		int n = ob.length;
//		for(int i = 0; i<=n-1; i++) {
//			flag = false;
//			for(int j =0; j<n-i;j++) {
//				if(ob[j]>ob[j+1]) {
//					double temp = ob[j] ;
//					ob[j] = ob[j+1];
//					ob[j+1] = temp;
//					flag = true;
//					
//				}
//			}
//			if (!flag) {
//                break;
//            }
//		}
	//	System.out.print("Ascending Order of three numbers  ");

		for(Object asc : ob) {
			System.out.print(asc + " ,");
		}

		System.out.println();

		Arrays.sort(ob,Collections.reverseOrder());

		System.out.print("descending Order of three numbers  ");
		for(Object desc : ob) {
			System.out.print(desc + " ,");
		}


	}

	public static double numberChecker() {
		double num;
		double num1;
		Scanner sc;
		String str;
		while(true) {
			sc = new Scanner(System.in);

			System.out.println("Enter the number ");

			str = sc.nextLine();

			char[] ch = str.toCharArray();


			for(char c : ch) {
				if(c >=48 && c<=57||c >=48 && c<=57 ) {

					System.out.println("The given number is a number");

					if(str.contains(".")) {

						num = Double.parseDouble(str);

						return num;
					}

					else {
						num1 = Double.parseDouble(str);

						return num1;

					}

				}else System.out.println("Please Provide number");

			}

		}




	}
	
	
	
	
	
//	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	
//	System.out.println("How many numbers you wanted to give");
//	
//	int count = sc.nextInt();
//		
//	System.out.println("Continue..........");
//	
//	orderOfNumbers(count);
//		
//	}
//	
//	
//	public static void orderOfNumbers(int countOfUserDefinedNumber) {
//		Object[] ob = new Object[countOfUserDefinedNumber];
//		for(int i=0;i<countOfUserDefinedNumber;i++) {
//		ob[i] = numberChecker();
//		}
//		
//		//While I am entering double values as user input then I am getting 
//		//java.lang.Integer cannot be cast to java.lang.Double exception
//		
//		try{
//		 Arrays.sort(ob,Collections.reverseOrder());
//		
//		 System.out.print("descending Order of three numbers  ");
//			for(Object desc : ob) {
//				System.out.print(desc + " ,");
//			}
//			
//			System.out.println();
//			
//			Arrays.sort(ob);
//			System.out.print("Ascending Order of three numbers  ");
//			
//			for(Object asc : ob) {
//				System.out.print(asc + " ,");
//			}
//		
//		
//		}catch (Exception e) {
//			System.out.println("Multiple data types cannot be sorted... Please provide Same data type numbers");
//		}
//	}
//	
//	public static Object numberChecker() {
//		double num;
//		int num1;
//		Scanner sc;
//		String str;
//		while(true) {
//			sc = new Scanner(System.in);
//
//			System.out.println("Enter the number ");
//
//			str = sc.nextLine();
//
//			char[] ch = str.toCharArray();
//
//
//			for(char c : ch) {
//				if(c >=48 && c<=57||c >=48 && c<=57 && c == 46) {
//
//					System.out.println("The given number is a number");
//
//					if(str.contains(".")) {
//
//						num = Double.parseDouble(str);
//						
//						return num;
//						}
//
//					else {
//						num1 = Integer.parseInt(str);
//
//						return num1;
//
//					}
//
//				}else System.out.println("Please Provide number");
//
//			}
//
//		}
//
//
//
//
//	}


	
	
}
