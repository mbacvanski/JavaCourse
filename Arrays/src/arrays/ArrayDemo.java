package arrays;

public class ArrayDemo {

	public static void main(String[] args) {

		int[] anArray; //declares a new array
		anArray = new int[10]; //Sets the size of the array to 10
		
		anArray[0] = 100; //sets value of first place in array...
		anArray[1] = 200;
		anArray[2] = 300;
		anArray[3] = 400;
		anArray[4] = 500;
		anArray[5] = 600;
		anArray[6] = 700;
		anArray[7] = 800;
		anArray[8] = 900;
		anArray[9] = 1000;
		
		for (int i = 0; i < anArray.length; i++) {
			System.out.println("The number at the place " + i + " in the array is " + anArray[i]);
		}
	}

}
