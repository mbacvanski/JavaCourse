package arrays;

public class MoreMultiDimArrays {

	static int rows = 12;
	static int columns = 15;
	
	public static void main(String[] args) {
		int[][] multiplicationTable;
		multiplicationTable = new int[rows][columns];
		
		int[][] newMultiplicationTable = {{1, 2, 3, 4, 5}, {2, 4, 6, 8, 10}, {3, 6, 9, 12, 15},
											{4, 8, 12, 16, 20}, {5, 10, 15, 20, 25}};
		
		int totalRows = multiplicationTable.length;
		
		for (int row = 0; row < totalRows; row++) {
			int ColumnsInCurrentRow = multiplicationTable[row].length;
			
			for (int column = 0; column < ColumnsInCurrentRow; column++) {
				multiplicationTable[row][column] = row * column;
			}

		}
		
		for (int row = 0; row < totalRows; row++) {
			int ColumnsInCurrentRow = multiplicationTable[row].length;
			System.out.println();
			for (int column = 0; column < ColumnsInCurrentRow; column++) {
				System.out.print(multiplicationTable[row][column] + "    ");
			}

		}
		
		for (int row = 0; row < 5; row++) {
			int ColumnsInCurrentRow = newMultiplicationTable[row].length;
			System.out.println();
			for (int column = 0; column < ColumnsInCurrentRow; column++) {
				System.out.print(newMultiplicationTable[row][column] + "    ");
			}

		}
	}

}
