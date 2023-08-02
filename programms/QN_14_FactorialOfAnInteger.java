package programms;

public class QN_14_FactorialOfAnInteger {
	
	public static void main(String[] args) {
		
		System.out.println(factorialOfInteger(7));
	}

	public static long factorialOfInteger(int num) {
		if (num < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
		
		
		long factorial = 1;
		
		for(int i =1 ; i <= num ; i++) {
			
			factorial = factorial * i;
		}
		
		return factorial;
		
	}
}
