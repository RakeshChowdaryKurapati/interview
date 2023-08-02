package programms;

import java.util.Arrays;

public class QN_55_Segregate_0s_onLeftSideAnd_1s_onRightSideofTheArray {

	public static void main(String[] args) {
		
		int[] arr = {0,0,1,1,0,1,0,1,1,0};
		
		for(int i =0; i<arr.length ; i++) {
			
			for(int j=0; j<arr.length-i-1; j++) {
				
				if(arr[j]<arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			
				}
			}
			}
			System.out.println(Arrays.toString(arr));
		
	}
	
	
}
