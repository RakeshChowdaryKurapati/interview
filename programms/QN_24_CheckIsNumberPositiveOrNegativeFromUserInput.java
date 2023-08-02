package programms;

import java.util.Scanner;

public class QN_24_CheckIsNumberPositiveOrNegativeFromUserInput {

	public static void main(String[] args) {

		numberChecker();

	}
	public static String numberChecker() {
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
						if(num == 0) {
							System.out.println("The number is zero");
							return "The number is zero";
						}

						if(num>0) {

							System.out.println("The given is Positive number");

							return "The given is Positive number";
						}else {

							System.out.println("The given is Negative number");

							return "The given is Negative number";

						}

					}else {
						num1 = Integer.parseInt(str);

						if(num1 == 0) {
							System.out.println("The number is zero");
							return "The number is zero";
						}

						if(num1>0) {

							System.out.println("The given is Positive number");

							return "The given is Positive number";
						}else {

							System.out.println("The given is Negative number");

							return "The given is Negative number";

						}

					}


				}

				else System.out.println("Please Provide number");

			}

		}




	}



}
