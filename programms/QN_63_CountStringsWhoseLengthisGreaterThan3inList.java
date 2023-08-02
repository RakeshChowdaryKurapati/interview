package programms;

import java.util.ArrayList;
import java.util.List;

public class QN_63_CountStringsWhoseLengthisGreaterThan3inList {

	public static void main(String[] args) {

		String[] str = {"Hello","Interview","Questions","Answers","Ram","for"};
		
		List<String> ls = new ArrayList<>();
		
		int count = 0;

		for(String st : str) {
			
			ls.add(st);
		}
		
		for(String s: ls) {
			if(s.length()>3) {
				System.out.println(s);
				count++;
			}
		}

		System.out.println(count);
	}	
}
