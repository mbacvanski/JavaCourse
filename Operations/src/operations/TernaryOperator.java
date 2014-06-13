package operations;

public class TernaryOperator {

	public static void main(String[] args) {
		int num1 = 42;
		int num2 = 36;
		int result;
		boolean bool = true;
		//Assign and declare variables
		result = bool ? num1 : num2;
		//Shorthand if-then-else statement
		/* if (bool) {
		 *     result = num1;
		 * }
		 * else {
		 * 	   result = num2;
		 * }
		 */
		System.out.println("The result is: " + result);
	}

}
