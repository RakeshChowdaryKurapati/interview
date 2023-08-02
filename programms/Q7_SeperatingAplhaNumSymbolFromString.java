package programms;

public class Q7_SeperatingAplhaNumSymbolFromString {
	
	public static void main(String[] args) {
		
		
		extractorFromString_Approach_1("Test@#$For1234Here987&");
		extractorFromString_Approach_2("Test@#$For1234Here987&");
		extractorFromString_Approach_3("Test@#$For1234Here987&");
		
	}
	
	
	
	public static void extractorFromString_Approach_1(String str) {
		
		StringBuffer alpha = new StringBuffer() ;
		StringBuffer num = new StringBuffer();
		StringBuffer special = new StringBuffer();
		
		for(int i =0; i<str.length(); i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				alpha.append(str.charAt(i));
			}else if(Character.isDigit(str.charAt(i))) {
				num.append(str.charAt(i));
			}else {
				special.append(str.charAt(i));
			}
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(special);
		
	}
	
	public static void extractorFromString_Approach_2(String str) {
		
		
		String alpha = str.replaceAll("[^A-Za-z]", "");
		String num = str.replaceAll("[^0-9]", "");
		String specialChar = str.replaceAll("[A-Za-z0-9]", "");
		
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(specialChar);
		
	}
	
	public static void extractorFromString_Approach_3(String str) {
		
		char[] ch = str.toCharArray();
		String alpha = "" ;
		String num = "";
		String special= "";
		for (char fl : ch) {
			if((fl>=65 && fl<=90) || (fl>=97 && fl<=122)) {
				
				alpha = alpha + Character.toString(fl);
				
			}else if (fl>=48 && fl<=57) {
				num = num + Character.toString(fl);
			}else {
				special = special + Character.toString(fl);
			}
		
			
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(special);
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
