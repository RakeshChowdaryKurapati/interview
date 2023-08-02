package programms;

public class QN_11_IsPrimeNumber {

	
	public static void main(String[] args) {
		
		boolean flag = isPrime(283);
		
		System.out.println(flag);
	}
	
	public static boolean isPrime(int number) {
		int count =0;
		boolean flag = false;
		for(int i =1; i <=number;i++) {
			if(number % i == 0) {
				count++;
			}
				
		}
		
		if(count == 2) {
			System.out.println("Given number is prime number");
			flag = true;
		}
		else {
			System.out.println("Given number is not a prime number");
			flag = false;
		}
		
		return flag;
		
	}
	
}
