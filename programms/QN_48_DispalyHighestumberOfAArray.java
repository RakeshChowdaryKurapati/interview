package programms;

public class QN_48_DispalyHighestumberOfAArray {
	
	public static void main(String[] args) {

		int[] arr = {10,30,50,60,80,96,45,32,22};
		
		int highest = arr[0];
		
		for(int i =1; i<arr.length;i++) {
			
			if(arr[i] > highest) {
				highest = arr[i];
			}
			
		}
		
		System.out.println(highest);
	}


}
