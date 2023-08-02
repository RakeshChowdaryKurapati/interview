package programms;

import java.util.Scanner;

public class QN_23_SquareOfUserInputNumber {


	public static void main(String[] args) {

		squareOfNumber();
		

	}

	
	public static Object squareOfNumber() {
		double num;
		int num1;
		Scanner sc;
		String str;
		while(true) {
			sc = new Scanner(System.in);

			System.out.println("Enter the number ");

			str = sc.nextLine();

			char[] ch = str.toCharArray();


			for(char c : ch) {
				if(c >=48 && c<=57||c >=48 && c<=57 && c == 46) {

					System.out.println("The given number is a number");

					if(str.contains(".")) {

						num = Double.parseDouble(str);

						num = num * num;

						System.out.println("Square of the given number is  "+num);

						return num;

					}else {
						num1 = Integer.parseInt(str);

						num1 = num1 * num1;

						System.out.println("Square of the number is  "+num1);


						return num1;
					}

				}
				
				else System.out.println("Please Provide number");

			}

		}



	}



}
