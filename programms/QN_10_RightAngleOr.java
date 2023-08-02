package programms;

public class QN_10_RightAngleOr {
	
	public static void main(String[] args) {
		
		boolean flag = isRightAngle(60, 30, 90);
		
		System.out.println(flag);
		
	}
	
	public static boolean isRightAngle(int a, int b ,int c) {
		boolean flag = false;
		
		if(a+b+c == 180) {
			if (a == 90 || b ==90 || c == 90) {
				System.out.println("The given triangle is right angle triangle");
				flag = true;
			}else {
				System.out.println("The given triangle is not a right angle triangle");
				flag = false;
			}
		}else {
			System.out.println("Invalid Triangle");
		}
		
		return flag;
	}

}
