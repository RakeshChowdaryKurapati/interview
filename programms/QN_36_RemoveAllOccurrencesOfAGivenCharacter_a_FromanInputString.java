package programms;

public class QN_36_RemoveAllOccurrencesOfAGivenCharacter_a_FromanInputString {

	public static void main(String[] args) {
		
		removeCharFromString("abcdABCDabcdABCD");
		
	}
	
	public static void removeCharFromString(String input) {
		
		char[] ch = input.toCharArray();
		String result = "";
		for(char c : ch) {
			if(c != 'a') {
				result = result + Character.toString(c);
			}
		}
		System.out.println(result);
		
		
	}
}
