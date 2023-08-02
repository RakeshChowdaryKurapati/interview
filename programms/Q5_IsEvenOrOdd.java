package programms;

public class Q5_IsEvenOrOdd {
	
	public static void main(String[] args) {
		
		isEvenOrOdd(12345);
		isEvenOrOdd(12344);
		
	}

	public static void isEvenOrOdd(int num) {
		
		if (num%2 ==0) {
			System.out.println("Given number is even");
		}
		else {
			System.out.println("Given number is odd");
		}
	}
	
}
