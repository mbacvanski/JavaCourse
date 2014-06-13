package controlFlow;

public class IfThenStatements {

	public static void main(String[] args) {
		boolean bool1 = true;
		boolean bool2 = false;
		boolean bool3 = true;
		if (bool1) {
			System.out.println("The first boolean is true!");
			if (bool2) {
				System.out.println("The second boolean is also true!");
				if (bool3) {
					System.out.println("The third boolean is also true!");
				}
			}
		}
		if (bool2) {
			System.out.println("The second boolean is true!");
			if (bool3) {
				System.out.println("The third boolean is also true!");
			}
		}
		if (bool3) {
			System.out.println("The third boolean is true!");
		}
		else {
			System.err.println("Something was wrong...");
		}
	}

}
