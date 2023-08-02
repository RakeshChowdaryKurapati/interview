package programms;

public class QN_52_StringToUpperCase {
	
	public static void main(String[] args) {
		
		String str = "This is The Test Program";
		
		char[] ch = str.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			
			if(ch[i]>=97 && ch[i]<=122) {
				ch[i] =  (char) (ch[i]-('a'-'A'));
			}
			
		}
		String upper = new String(ch);
		System.out.println(upper);
		
	}

}
