package programms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QN_66_AllPermutationsOfGivenString {

	public static void main(String[] args) {
		
		String input = "JSP";
		
		// The recursion will execute until reach the base condition
		// Other wise we will get the stack overflow error
		
		//print numbers from 5 to 1
		
	
		printNumbers(8);
		
		permutation("JSP","");
		approachPermutation("Rakesh", "");

	}
	
	public static void printNumbers(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		printNumbers(n-1);
		
	}
	
	public static void permutation(String str, String ans) {
		
		if(str.length()== 0) {
			System.out.println(ans + " ");
			return;
		}else
		{
			for(int i =0; i<str.length(); i++) {
				char ch = str.charAt(i);
				String ros = str.substring(0, i)+str.substring(i+1);
				permutation(ros,ans + ch);
			}
		}
		
		
		
		
	}
	
	
	public static void approachPermutation(String str, String ans) {
		
		if(str.length() ==0 ) {
			System.out.println(ans + " ");
			return;
		}else {
			for(int i =0; i<str.length(); i++) {
				char ch = str.charAt(i);
				String sr = str.substring(0,i)+str.substring(i+1);
				approachPermutation(sr,ans+ch);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
}
