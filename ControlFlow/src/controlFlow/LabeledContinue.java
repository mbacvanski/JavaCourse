package controlFlow;

public class LabeledContinue {

	public static void main(String[] args) {
		String searchThis = "These fuzzy chukars are nice and puffy.";
		String searchWhat = "zed";
		String currentSubstring = "";
		boolean foundYet = false;
		int length = searchThis.length();
		int subLength = searchWhat.length();
		
		
	test:
		for (int i = 0; i < length - 1; i++) {
			currentSubstring = searchThis.substring(i, i + subLength).toLowerCase();
			if (currentSubstring.equals(searchWhat)) {
				foundYet = true;
				break test;
				
			} 
			else {
				continue test;
			}
		}
		
		if (foundYet) {
			System.out.println("The string contains the substring we were looking for!");
		}
		else {
			System.out.println("The string doesn't contain the string we were looking for!");
		}
		
	}

}
