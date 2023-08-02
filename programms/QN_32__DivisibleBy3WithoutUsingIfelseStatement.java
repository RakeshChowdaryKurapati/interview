package programms;

public class QN_32__DivisibleBy3WithoutUsingIfelseStatement {

	public static void main(String[] args) {
		
		divisibleBy7WithoutUsingIfelse1(120);
		System.out.println();
		divisibleBy7WithoutUsingIfelse2(10);
		
	}
	
	public static void divisibleBy7WithoutUsingIfelse1(int range) {
		
		int i =7;
		do {
			
			System.out.print(i+ " ");
			
			i += 7;
					
		}while (i<=range);
	}
	public static void divisibleBy7WithoutUsingIfelse2(int range) {
		
		
		
		for(int i = 7; i<=range ; i += 7) {
			
			System.out.print(i+ " ");
			
		}
	}
	
}
