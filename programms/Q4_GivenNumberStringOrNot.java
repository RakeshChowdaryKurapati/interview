package programms;

public class Q4_GivenNumberStringOrNot {

	public static void main(String[] args) {
		isNumber("12345Test");
		isNumber("12345");
		
	}
	
	public static boolean isNumber(String number) {
		
		char[] ch = number.toCharArray();
		
		boolean flag = true;
		
		
		for(char fl : ch) {
			
			if(fl<48 || fl > 57) {
				flag = false;
				break;
			}
			
		}
		if(flag == false) {
			System.out.println("Given string is not a number");
		}
		else System.out.println("Given string is a number");
		
		
		
		return flag;
		
		
		
		
		
	}
	
	
	
//	public static boolean isNumber(String number) {
//		
//		try{
//			int num = Integer.parseInt(number);
//			System.out.println("Given string is number "+num);
//			return true;
//		}catch (Exception e) {
//			System.out.println("Given string is not number");
//			return false;
//		}
//		
//	}
	
	
}
