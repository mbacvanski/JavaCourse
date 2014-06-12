package operations;

public class Unary {

	public static void main(String[] args) {
		int unaryPositive;
		int unaryNegative;
		int unaryIncrement;
		int originalNum;
		int unaryDecrement;
		boolean unaryComplement;
		boolean unaryOriginal;
		//Declare variables!
		unaryNegative = -42;
		unaryPositive = +42;
		//Demonstrate positive and negative
		originalNum = 42;
		unaryIncrement = ++originalNum;
		//Demonstrate increments
		originalNum = 42;
		unaryDecrement = --originalNum;
		//Demonstrate decrements
		unaryOriginal = true;
		unaryComplement = !unaryOriginal;
		//Demonstrate negation
		System.out.println("The positive of " + unaryNegative + " is " + unaryPositive);
		System.out.println("The increment of " + originalNum + " is " + unaryIncrement);
		System.out.println("The decrement of " + originalNum + " is " + unaryDecrement);
		System.out.println("The complement of " + unaryOriginal + " is "+ unaryComplement);
		//Print everything out!
	}

}
