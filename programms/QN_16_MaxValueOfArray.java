package programms;

public class QN_16_MaxValueOfArray {

	
	public static void main(String[] args) {
		int a = 19;
		int b = 3;
		int c = 11;
		
		int largest = a;
		try {
			
		if(b>largest) {
			largest = b;
		}
		if(c>largest) {
			largest = c;
		}
		
		
		System.out.println(largest);
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
}
