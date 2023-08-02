package programms;

public class Q9_TriangleIsValidOrNot {

	public static void main(String[] args) {
		System.out.println(isTriangle(70, 30, 80));
		
	}
	
	public static boolean isTriangle(int angle1, int angle2, int angle3) {
		boolean flag = false; 
		
		if((angle1+angle2+angle3)==180) {
			flag = true;
			System.out.println("given triangle is valid triangle");
		}else {
			flag = false;
			System.out.println("given triangle is invalid triangle");
		}
		return flag;
	}
}
