package programms;

import java.util.*;


public class QN_39_DistinctInteger {

	public static void main(String[] args) {
		distinct();
	}
	public static void distinct() {
		
		List<Integer> distinctNumbers = new ArrayList<>();
		
		int[] arr = {1,2,3,4,5,4,6,77,8,33,33,5,88,8,77};
		
		for(int num : arr) {
			if(!distinctNumbers.contains(num)) {
				distinctNumbers.add(num);
			}
		}
		System.out.println(distinctNumbers);
		
	}
}
