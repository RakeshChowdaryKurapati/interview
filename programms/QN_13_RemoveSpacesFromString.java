package programms;

public class QN_13_RemoveSpacesFromString {
	
	public static void main(String[] args) {
		
		String str = "The given string has spaces   ";
		
		char[] arr = str.toCharArray();
		
		String wos = "";
		
		for (char ch : arr) {
			if(ch != ' ') {
				wos = wos + Character.toString(ch);
			}
		}
		
		System.out.println(wos);
	}

}
