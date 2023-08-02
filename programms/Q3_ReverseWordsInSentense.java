package programms;

public class Q3_ReverseWordsInSentense {

	public static void main(String[] args) {
		reverseTheWordsOfTheSentence();
	}
	
	
	public static void reverseTheWordsOfTheSentence() {
		String sentense = "Welcome to Xavient Digital";
		String[] str = sentense.split(" ");
		String reverse ="";
		
		for(int i =str.length-1; i>=0; i--) {
			reverse = reverse+str[i]+" ";
			
		}System.out.println(reverse);
	}
	
	
	
}
