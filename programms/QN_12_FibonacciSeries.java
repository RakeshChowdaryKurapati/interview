package programms;

public class QN_12_FibonacciSeries {
	
	public static void main(String[] args) {
		
		int count = 10;
		
		int firstNumber = 0;
		int secondNumber = 1;
		
		System.out.print(firstNumber + " " + secondNumber); 
		
		for(int i = 2; i< count; i++) {
			
			int nextNumber = firstNumber + secondNumber ;
			
			System.out.print(" "+nextNumber);
			
			firstNumber = secondNumber;
			
			secondNumber = nextNumber;
			
			
		}
		
	}

}
