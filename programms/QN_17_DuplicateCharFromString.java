package programms;

import java.util.HashMap;
import java.util.Map;

public class QN_17_DuplicateCharFromString {
	
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
		
		
		
		for(Map.Entry<Character, Integer> entry : hm.entrySet() ) {
			if(entry.getValue()>0) {
				System.out.print(entry.getKey()+ " ");
			}
				
		}
		
		meth1();
	
		
		
	}
	
	static public void meth1() {
		
		String str = "rakeshchowdarykurapati";
		
		String[] arr = str.split("");
		
HashMap<String, Integer> hm = new HashMap<>();
		
		for (String c : arr) {
			if(hm.containsKey(c)) {
				
				hm.put(c, hm.get(c)+1);
			}else {
			
				hm.put(c, 1);
			}
		}
		
		
		System.out.println(hm);
		
	}

}
