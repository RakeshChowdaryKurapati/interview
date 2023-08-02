package programms;

public class QN_22_AreaOfCircle {

	final static double PI = 3.14159;

	public static void main(String[] args) {
		
		System.out.println(areaOfCircle(4));
	}


	public static double areaOfCircle(double radius) {
		
		
		if(radius < 0 ) {

			System.out.println("The given input i.e radius of circle is invalid");
		}


		double area = PI*radius*radius;

		return area;

	}


}
