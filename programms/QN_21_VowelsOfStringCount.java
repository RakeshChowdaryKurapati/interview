package programms;

import java.util.Arrays;
import java.util.HashSet;

public class QN_21_VowelsOfStringCount {
	
	
	public static void main(String[] args) {
		
		vowelCount("Rakesh Naidu");
		
		
	}
	
	public static void vowelCount(String str) {
		
		String str1 = str.toLowerCase();
		
		String str2 = "";
		
		char[] ch = str1.toCharArray();
		
		for(char c : ch) {
			
			if(c == 'a'||c =='e'||c =='i'||c =='o'||c =='u') {
				
				str2 += Character.toString(c);
				
				
			}
			
			
		}
		System.out.println(str2);
		System.out.println(" Total count of vowels in the string are " + str2.length());
		
		char[] alphabets = str2.toCharArray();
		
		HashSet<Character> set = new HashSet<>();
        for (char c : alphabets) {
            set.add(c);
            
        }
        
        System.out.println(set);
        
        System.out.println("Distinct Count of vowels in the String are " + set.size());
        
	}
	
	
	
	
	
	
	
	
	
	

}
