package controlFlow;

public class LabeledBreak {

	public static void main(String[] args) {
		int [][] integers = {
		{0, 1, 2, 3, 4, 5},
		{10, 11, 12, 13, 14, 15},
		{20, 21, 22, 23, 24, 25},
		{30, 31, 32, 33, 34, 35},
		{40, 41, 42, 43, 44, 45}	};
		
		int searchingFor = 42;
		
		boolean foundIt = false;
		
	search:	
		for (int i = 0; i < integers.length; i++) {
			for (int j = 0; j < integers[0].length; j++) {
				if (integers[i][j] == searchingFor) {
					foundIt = true;
					break search; // breaks out of the whole search section! 
				}
			}
		}
		
		if (foundIt == false) {
			System.out.println(searchingFor + " is not in this array!");
		}
		else {
			System.out.println(searchingFor + " is in this array!");
		}
		
	}

}
