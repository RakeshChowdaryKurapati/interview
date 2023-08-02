package programms;

import java.util.Arrays;

public class QN_67_Anagram {
	
	public static void main(String[] args) {
		
		String str = "Dormitory";
		
		String str2 = "DirtyRoom";
		
		char[] ch =  str2.toLowerCase().toCharArray();
		
		boolean flag = false;
		
	if(str.length()==str2.length()) {	for(char fl : ch) {
			if(str.contains(Character.toString(fl))) {
				
				flag = true;
				
			}
			else {
				flag = false;
			}
		}
	
	}
		
		if(flag == true) {
			System.out.println("The given String is an anagram ");
		}
		else System.out.println("The given String is not an anagram ");
		
		approach2("Dormitory","DirtyRoom");
		
	}
	
	public static void approach2(String str, String str2) {
		
		
	
	
	String[] st = str.split("");
	String[] st1 = str2.split("");
	Arrays.sort(st);
	Arrays.sort(st1);
	boolean flag = false;
	if(st.length == st1.length) {
		for(int i =0; i<st.length; i++) {
			if(st[i].equals(st1[i]) ){
				flag = true;
			}else {
				flag = false;
				
			}
		}
	}
	if(flag == true) {
		System.out.println("The given String is an anagram ");
	}
	else System.out.println("The given String is not an anagram ");
	
}
	
		
		
	}


