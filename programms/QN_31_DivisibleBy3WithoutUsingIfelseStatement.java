package programms;

public class QN_31_DivisibleBy3WithoutUsingIfelseStatement {

	public static void main(String[] args) {
		divisibleBy3WithoutUsingIfelse1(30);
	}

	public static void divisibleBy3WithoutUsingIfelse1(int range) {

		int i =3;

		do {

			System.out.print(i+ " ");

			i+=3;


		}while (i%3==0 && i<=range);


	}

	public static void divisibleBy3WithoutUsingIfelse2(int range) {

		for(int i =1; i<=range && i%3==0; i++) {
			
			System.out.print(i+ " ");
			
		}


	}



}
