package programms;

public class QN_54_LastLetterOfWordInStringShouldInCaps {

	public static void main(String[] args) {
		
		String str = "This is The Test Program";
		
		char[] ch = str.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			
			if(ch[i]==' ' && ch[i-1]>=97 && ch[i-1]<=122) {
				ch[i-1] =  (char) (ch[i-1]-('a'-'A'));
			}
			
		}
		String upper = new String(ch);
		System.out.println(upper);
	
	
}
	
	
}
