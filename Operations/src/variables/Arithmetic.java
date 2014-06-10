package variables;

public class Arithmetic {

	public static void main(String[] args) {
		int sum;
		int difference;
		int product;
		double quotient;
		int modulo;
		String jeeb;
		//Declare variables
		sum = 70 + 42;
		difference = 70 - 42;
		product = 70 * 42;
		quotient = 70.0 / 42.0;
		//Must use doubles in division (70.0 & 42.0) to get double result
		modulo = 70 % 42;
		jeeb = "Hello " + "World!";
		//Do operations on the variables
		System.out.println("70 + 42 = " + sum);
		System.out.println("70 - 42 = " + difference);
		System.out.println("70 * 42 = " + product);
		System.out.println("70 / 42 = " + quotient);
		System.out.println("70 % 42 = " + modulo);
		System.out.println("Hello + World = " + jeeb);
		//Print everything out!
	}

}
