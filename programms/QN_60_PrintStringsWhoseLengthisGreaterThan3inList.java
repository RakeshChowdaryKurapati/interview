package programms;

import java.util.*;

public class QN_60_PrintStringsWhoseLengthisGreaterThan3inList {

	public static void main(String[] args) {

		String[] str = {"Hello","Interview","Questions","Answers","Ram","for"};
		
		List<String> ls = new ArrayList<>();

		for(String st : str) {
			
			ls.add(st);
		}
		
		for(String s: ls) {
			if(s.length()>3) {
				System.out.println(s);
			}
		}

	}	

}
