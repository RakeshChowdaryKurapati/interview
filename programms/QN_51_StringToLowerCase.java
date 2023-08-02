package programms;

import java.util.Arrays;

public class QN_51_StringToLowerCase {

	public static void main(String[] args) {
		
		String str = "This is Test Program";
		
		String str1 = str.toLowerCase();
		
		System.out.println(str1);
		approach2();
	}
		public static void approach2() {
			String str = "This is Test Program";
			
			char[] ch = str.toCharArray();
			
			for(int i =0; i<ch.length;i++) {
				
				if(ch[i] >= 'A' && ch[i]<='Z') {
					ch[i] = (char) (ch[i] + (32));
					// or we can use ch[i] = (char) (ch[i] + ('a'-'A'));
					
				}
				
			}
		String lower = new String(ch);
			System.out.println(lower);
		}
}
