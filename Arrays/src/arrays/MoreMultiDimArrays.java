package arrays;

public class MoreMultiDimArrays {

	static int rowNumber = 12;
	static int columnNumber = 15;
	
	public static void main(String[] args) {
		int[][] multiplicationTable;
		multiplicationTable = new int[rowNumber][columnNumber];
		
		int totalRows = multiplicationTable.length;
		
		for (int row = 0; row < totalRows; row++) {
			int ColumnsInCurrentRow = multiplicationTable[row].length;
			
			for (int column = 0; column < ColumnsInCurrentRow; column++) {
				multiplicationTable[row][column] = row * column;
			}

		}
		
		System.out.println(multiplicationTable);
	}

}
