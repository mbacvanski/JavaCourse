package moreClasses;

public class OverloadingMethods {

	public static void main(String[] args) {
		int i = 42;
		double d =  42.4242;
		float f = 42.4f;
		long l = 424242424242424242l;
		
		printNum(i);
		printNum(d);
		printNum(f);
		printNum(l);
	}
	
	private static void printNum (int i) {
		System.out.println("This was printed using the integer printNum: " + i);
	}
	
	private static void printNum (double d) {
		System.out.println("This was printed using the double printNum: " + d);
	}
	
	private static void printNum (float f) {
		System.out.println("This was printed using the float printNum: " + f);
	}
	
	private static void printNum (long l) {
		System.out.println("This was printed using the long printNum: " + l);
	}

}
