package controlFlow;

public class ForLoops {

	public static void main(String[] args) {
		for (int i = 1; i <= 42; i++) {
			System.out.println("The count right now is: " + i);
		}
		
		int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for (int j : numbers	) {
			System.out.println("The other count right now is: " + j);
		}
	}

}
