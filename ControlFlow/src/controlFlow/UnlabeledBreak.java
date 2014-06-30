package controlFlow;

public class UnlabeledBreak {

	public static void main(String[] args) {
		int [] integers = {37, 73, 24, 89, 42, 91, 46, 56};
		
		int searchingFor = 42;
		boolean foundIt = false;
		
		for (int i : integers) {
			if (i == searchingFor) {
				foundIt = true;
				break;
			}
		}
		
		if (foundIt == false) {
			System.out.println("The item we were looking for does not exist in the array!");
		}
		else {
			System.out.println("We found the item we were looking for!");
		}
	}

}
