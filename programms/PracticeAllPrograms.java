package programms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PracticeAllPrograms {
	
	
	public static void main(String[] args) {
		
		
//		polindrom();
//		approach2Polindrom();
//		swapNum();
//		pyramid();
//		numberreerse();
//		febonicca();
//		distinct();
//		System.out.println();
//		dem();
	missingArrayNum();
		
		 /* int count = 6;
	        
	        for(int i =1; i<=count; i++){
	            for(int j = 1; j<= count-i; j++){
	                System.out.print(" ");
	            }
	            for(int k =1; k<=2*i-1; k++){
	                System.out.print(k);
	            }
	            System.out.println();
	        }*/
	}
	
	public static void polindrom() {
		String str = "radar";
		String reverse = "";
		char[] ch = str.toCharArray();
		for(char c : ch) {
			reverse = reverse+Character.toString(c);
		}
		
		boolean flag = reverse.equals(str);
		
		if(flag == true){
			System.out.println("Given String is polindrom");
		}else System.out.println("No ploindrom");
		
	}

	public static void approach2Polindrom() {
		
		
		String str = "radar";
		
		String reverse = "";
		
		char[] ch = str.toCharArray();
		
		for(int i =str.length() - 1; i >=0; i--) {
			reverse = reverse + ch[i];
		}
		
		System.out.println(reverse);
		
		
		
		
	}
	
	public static void swapNum() {
		int a = 4;
		int b = 5;
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a+" "+b);
	}
	
	public static void pyramid() {
		int n = 5;
		for(int i = 1;i<=n; i++) {
			
			for(int j = 1; j<=n-i;j++) {
				System.out.print(" ");
			}for(int k =1; k <= 2*i-1;k++ ) {
				System.out.print("*");
			}
			
			System.out.println();
		
			
		}
		
	}
	public static void dem() {
		 int count = 5;
	        for(int i =1; i<=count; i++) {
	            for (int j = 1; j<=count-i; j++) {
	                System.out.print(" ");
	            }
	            for(int k =1; k<=2*i-1; k++) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }
	}
	
	public static void numberreerse()
	{
		
		int num = 12321;
		int reverse = 0;
		
		while(num != 0 ) {
			int reminder = num % 10;
			reverse = reverse *10 + reminder;
			num = num /10;
		}
		
		System.out.println(reverse);
	
	}
	public static void febonicca() {
		int count = 10;
		int firstNum = 0;
		int secondNum = 1;
		
		for (int i = 2; i <=10; i++) {
			int nextNum = firstNum + secondNum;
			System.out.print(" "+nextNum);
			firstNum = secondNum;
			secondNum = nextNum;
		}
	}
	
	
	public static void distinct() {
		String str = "today is evaluation day";
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap();
		
		for(char c: ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : hm.entrySet()) {
			if(entry.getValue()>1) {
				
				System.out.print(entry.getKey());
			}
		}
	
	}
	public static void missingArrayNum() {
		
		int[] num = {3,4,7,11,9};
		
		
		Arrays.sort(num);
		TreeMap<Integer, Integer> hm = new TreeMap<>();
		for (int n: num) {
			hm.put(n, 1);
		}
		
		for(int i =0; i< num[num.length-1]; i++) {
			if(hm.containsKey(i)) {
				continue;
				
			}else {
				System.out.print(i+ " ");
			}
		}
	
		
		
		
		
	}
	
}
