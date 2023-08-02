package programms;

import java.util.HashMap;
import java.util.Map;

public class QN_15_DistinctCharacters {
	
	public static void main(String[] args) {
		
		String str = "RakeshChowdaryKurapati";
		
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
		
		for(Map.Entry<Character, Integer> entry : hm.entrySet() ) {
			System.out.println(entry.getKey()+" is repeated  :   "+ entry.getValue()+"   times ");
		}
		
		
		
		
//		int count = 0;
//		
//		char ch1 = ' ';
//		
//		HashMap map = new HashMap<>();
//		
//		for (int i = 0; i<str.length(); i++) {
//			
//			for (int j=i+1; j<str.length(); j++) {
//				if(str.charAt(i)==str.charAt(j)) {
//					
//					count ++;
//					
//					 map = new HashMap<>();
//					
//					map.put(str.charAt(i), count);
//					
//				}else {
//					
//					 map = new HashMap<>();
//					
//					map.put(str.charAt(i), count);
//					
//				}
//			}
//		}
//		
//		System.out.println(map);
	}

}
