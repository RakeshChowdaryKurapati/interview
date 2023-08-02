package programms;

public class QN_57_PrintTheElementsofanArrayPresentonOddPosition {

	public static void main(String[] args) {
		
		int[] arr = { 23,21,43,34,45,32,34,54,46,75,57};
		
		for(int i =0; i<arr.length;i+=2) {
			System.out.print(arr[i]+ ", ");
		}
		
	}
	
}
