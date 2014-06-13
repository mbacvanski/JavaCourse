package operations;

public class Comparisons {

	public static void main(String[] args) {
		int num1 = 18;
		int num2 = 42;
		//Declare and assign two variables.
		System.out.println("The first value is " + num1);
		System.out.println("The second value is " + num2);
		if (num1 == num2) {
			System.out.println("The first value is equal to the second value!");
		}
		if (num1 > num2) {
			System.out.println("The first value is greater than the second value!");
		}
		if (num1 >= num2) {
			System.out.println("The first value is greater than or equal to the second value!");
		}
		if (num1 < num2) {
			System.out.println("The first value is less than the second value!");
		}
		if (num1 <= num2) {
			System.out.println("The first value is less than or equal to the second value!");
		}
	}

}
