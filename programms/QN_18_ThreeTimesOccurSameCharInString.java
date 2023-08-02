package programms;

import java.util.HashMap;
import java.util.Map;

public class QN_18_ThreeTimesOccurSameCharInString {
	
	public static void main(String[] args) {
String str = "rakeshchowdarykurapati";
		
		char[] ch = str.toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for (char c : ch) {
			if(hm.containsKey(c)) {
				
				hm.put(c, hm.get(c)+1);
			}else {
			
				hm.put(c, 1);
			}
		}
		
		System.out.println(hm);
		
		System.out.print("Duplicates are : ");
		
		for(Map.Entry<Character, Integer> entry : hm.entrySet() ) {
			if(entry.getValue()==3) {
				System.out.print(entry.getKey()+ " ");
			}
				
		}
		
	
		
		
	}


	}


