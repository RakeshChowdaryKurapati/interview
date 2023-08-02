package programms;

import java.util.*;

public class QN_58_CheckTheListOfIntegersContainsOddOnly {

	public static void main(String[] args) {
		
		List<Integer> ls = new ArrayList();
				
		ls.add(11);
		ls.add(93);
		ls.add(67);
		ls.add(45);
		ls.add(77);
		ls.add(33);
		int count = 0;
		System.out.print("Odd numbers of an array are : ");
		for(int num : ls) {
			
			if(num%2==1 || num == 1) {
				
				System.out.print(num+", ");
				count ++;
			}else break;
			
		}
		System.out.println();
		if(count==ls.size()) {
			System.out.println("The given List contains only odd numbers ");
		}else {
			System.out.println("The given List contains even numbers also ");
		}
		
	}
	
}
