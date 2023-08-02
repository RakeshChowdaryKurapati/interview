package programms;

import java.util.*;

public class QN_64_CountEachElementAndwordFromTheString {

	public static void main(String[] args) {
		
		String input ="AA BB AA CC";
		
		String[] str = input.split(" ");
		
		HashMap<String, Integer> hm = new HashMap();
		
		for(String st : str) {
			
			hm.put(st, hm.getOrDefault(st, 0)+1);
				
			}
			
		for(Map.Entry<String, Integer> entry : hm.entrySet()) {
			
			System.out.println(entry.getKey()+ " : "+ entry.getValue());
			
		}
		
			
	}
}
