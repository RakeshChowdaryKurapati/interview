package programms;

import java.util.Arrays;

public class QN_56_DescendingOrderOfAnArray {

	public static void main(String[] args) {
		
		int[] arr = { 23,21,43,34,45,32,34,54,46,75,57};
		
		for(int i=0; i<arr.length-1; i++) {
			
			for(int j =0; j<arr.length-i-1; j++) {
				
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
				
			}
			
		}
		
		System.out.println("Descending order of an array "+Arrays.toString(arr));
		
	}
	
	
}
