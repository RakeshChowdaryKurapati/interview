package programms;

public class Q1_Palindrom {

	public static void main(String[] args) {
		int num = 12321;
		int reverse;
		
		String str = Integer.toString(num);
		String rev = "";
		char[] ch = str.toCharArray();
		
		for(int i = str.length()-1; i>=0 ; i--) {
			
			rev = rev+ch[i];	
		}
		System.out.println(rev);
		
		  reverse = Integer.parseInt(rev);
		 try {
			 boolean flag = num == reverse;
			 System.out.println(flag);
			 if(flag == true) {
			 System.out.println("Given number is "+num+" polindrom");}
			 else throw new Exception();
		 }catch (Exception e) {
			 System.out.println("Given number is "+num+" not polindrom");
		}
				 
		 try {
			 int numb = 2345432;
			 boolean flag = ispolidrom(numb);
			 System.out.println(flag);
			 if(flag == true) {
				 System.out.println("Given number is polindrom");}
			 else throw new Exception();
			 
		 }catch (Exception e) {
			 System.out.println("Given number is not polindrom");
		}
		 
		
	}
	
	public static boolean ispolidrom(int original) {
		  int number = original;
		int reverse = 0;
		System.out.println(number);
		while(number != 0) {
			int reminder = number % 10;
			reverse = (reverse *10)+ reminder;
			number = number/10;
		}
		
		System.out.println(number);
		// here i done the operation with the number not with the original .. original will be the same in entire execution
		return reverse == original;
	}
	

	
	
	
	
	
	
	
	
	
	
}
