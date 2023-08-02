package programms;

import java.util.Scanner;

public class QN_28_SumOfDigitsOfANumber {

	public static void main(String[] args) {
		int n = (int) numberChecker();
		
		sumOfDigitsOfNumber(n);
		
	}
	
	public static int sumOfDigitsOfNumber(int num) {
		
		String temp = Integer.toString(num);
		
		int sum = 0;
		
		char[] ch = temp.toCharArray();
		 
		for(char i : ch) {
			
			int var = Integer.parseInt(String.valueOf(i));
			
			 sum = sum + var;
			
			
		}
		
		System.out.println("Sum of the digits of given numer is  "+sum);
		return sum;
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
	
	
}
