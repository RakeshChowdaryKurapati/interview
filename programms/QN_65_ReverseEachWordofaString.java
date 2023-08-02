package programms;

public class QN_65_ReverseEachWordofaString {

	public static void main(String[] args) {
		
		String InputString ="I am string not reversed";
		
		String[] arr = InputString.split(" ");
		
		String reverse = "";
		
		for(String str : arr ) {
			char[] ch  = null;
			 ch = str.toCharArray();
			for(int i = str.length()-1; i>=0;i--) {
				reverse = reverse + ch[i];
			}
			
			reverse = reverse + " ";
		}
		
		System.out.println(reverse);
	}
	
}
