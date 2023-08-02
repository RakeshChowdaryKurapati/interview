package programms;

public class QN_50_SortingIntegerArray {


	public static void main(String[] args) {

		int[] arr = { 23,21,43,34,45,32,34,54,46,75,57};
		System.out.println("Random Integr Array  ");
		for(int num : arr) {
			System.out.print(num + " , ");
		}
		System.out.println();
		
		for(int i =0 ; i<arr.length-1;i++) {
			for(int j =0; j<arr.length-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
			}
		}
		for(int num : arr) {
			System.out.print(num + " , ");
		}

	}
	
}
