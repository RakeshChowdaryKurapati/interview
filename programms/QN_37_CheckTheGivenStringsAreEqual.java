package programms;

public class QN_37_CheckTheGivenStringsAreEqual {

	public static void main(String[] args) {
		stringEquality();
		stringEquality2();
	}
	public static void stringEquality() {

		String s1="hello test";
		String s2="hello test";
		

		if(s1 == s2) {
			System.out.println("s1 and s2 are equal");
		}else {
			System.out.println("s1 and s2 are not equal");
		}

		

	}
	public static void stringEquality2() {
		String s1="hello test";
		String s2= new String("hello test");
		if(s1 == s2) {
			System.out.println("s1 and s2 are equal");
		}else {
			System.out.println("s1 and s2 are not equal");
		}
	}

}
