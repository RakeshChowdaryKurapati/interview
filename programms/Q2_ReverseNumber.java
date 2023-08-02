package programms;

public class Q2_ReverseNumber {

	public static void main(String[] args) {
		reverseNumber(56789);
	
	
	
	}
	
	public static int reverseNumber(int input) {
		int num = input;
		
		int reverse = 0;
		
		while(num != 0) {
			
			int reminder = num % 10;
			reverse = reverse *10  + reminder;
			num = num/10;
			
		}
		System.out.println(reverse);
		
		
		return reverse;
	}
	
	
	
}
