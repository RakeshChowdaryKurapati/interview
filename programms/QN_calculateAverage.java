package programms;

public class QN_calculateAverage {

	
	public static void main(String[] args) {
		
		double arr[]= {12,13,14,45,60};
	System.out.println(	averageOfArray(arr));
		
	}
	
	public static double averageOfArray(double[] arr) {
		
		double sum = 0;
		double average = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			sum = sum + arr[i];
			
		}
		
		
		average = sum/arr.length;
		
		return average;
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
