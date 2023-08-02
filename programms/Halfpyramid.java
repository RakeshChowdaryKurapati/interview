package programms;

public class Halfpyramid {

	public static void main(String[] args) {
		int count = 5;
		
		for(int i = 1; i<=count; i++) {
			for(int j = 1; j<=i; j++) {
			System.out.print("*");
		}
			System.out.println();
		}
	/// HalfPyramid of numbers	

		
		for(int i = 1; i<=count; i++) {
			for(int j = 1; j<=i; j++) {
			System.out.print(j);
		}
			System.out.println();
		}
	
	//// HalfPyramid of alphabets
		
		for(char i = 'a'; i<='e'; i++) {
			for(char j = 'a'; j<=i; j++) {
			System.out.print(j);
		}
			System.out.println();
		
		}
	
	//// Left Triangle star pattern
		
		for (int i = 1; i<=count; i++) {
			for(int j= 1;j<=count-1; j++) {
				System.out.print(" ");
			}
			for(int k =count; k>=0;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	
		
	
	}
}
