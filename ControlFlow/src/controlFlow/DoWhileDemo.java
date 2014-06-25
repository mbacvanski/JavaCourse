package controlFlow;

public class DoWhileDemo {

	public static void main(String[] args) {
		do {
			System.out.println("You should see this only once!");
		} while (false);
		
		int counter = 5;
		
		do {
			System.out.println("You should see this, however, 5 times!");
			counter --;
		} while (counter > 0);
	}

}
