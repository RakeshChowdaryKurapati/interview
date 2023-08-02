package programms;

public class QN_59_PyramidNumPattern {

	public static void main(String[] args) {
		int count = 9;
		
		for(int i =1; i<=count; i++) {
			
			for(int j =1;j<=count-i;j++) {
				
				System.out.print(" ");
			
			}
			for(int k = 1; k<=i;k++) {
				
				System.out.print(i+ " ");
			}
			System.out.println();
		}
		
		
	}
	
}
