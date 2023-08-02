package programms;

public class QN_29_StarProgramSquarePattern {

	public static void main(String[] args) {
		
		squarePattern(5);
	}
	
	public static void squarePattern(int num) {
		
		for(int i=0; i<num;i++) {
			for(int j=0; j<num; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
	}
	
}
