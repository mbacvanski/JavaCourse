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
		
		unaryNegative = -42;
		unaryPositive = +42;
		
		originalNum = 42;
		unaryIncrement = ++originalNum;
		originalNum = 42;
		unaryDecrement = --originalNum;
		
		unaryOriginal = true;
		unaryComplement = !unaryOriginal;
		
		System.out.println("The positive of " + unaryNegative + " is " + unaryPositive);
		System.out.println("The increment of " + originalNum + " is " + unaryIncrement);
		System.out.println("The decrement of " + originalNum + " is " + unaryDecrement);
		System.out.println("The complement of " + unaryOriginal + " is "+ unaryComplement);
	}

}
