package controlFlow;

public class UnlabeledContinue {

	public static void main(String[] args) {
		String searchThis = "Chewy Chukar Cherries commonly contain caramel coated cores";
		int cOcurrances = 0;
		int length = searchThis.length();
		String currentLetter = "";
		
		for (int i = 0; i < length; i++) {
			currentLetter = searchThis.substring(i, i + 1);
			currentLetter = currentLetter.toLowerCase();
			if (!currentLetter.equals("c")) {
				continue; // goes back to for loop
			}
			
			cOcurrances++; //if the letter is a c
		}
		
		System.out.println("The letter c occurred in the string " + cOcurrances + " times!");
	}

}
