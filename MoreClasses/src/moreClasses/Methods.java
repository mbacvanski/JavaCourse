package moreClasses;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;

public class Methods {

	public static void main(String[] args) {
		System.out.println("Here are 10 random numbers between 5 and 42: " + randomNumbers(10, 5, 42).toString());
		System.out.println("Here is the print of a random number generator and a class: ");
		printer(new Bicycle(), new Random());
	}
	
	private static void printer(Object... args) {
		PrintStream print = new PrintStream(System.out);
		for (Object o : args) {
			String printed = o.toString();
			for (int i = 0; i < printed.length() - 1; i++) {
				print.append(printed.charAt(i));
			}
		}
		print.println();
	}
	
	private static ArrayList<Integer> randomNumbers	(int howMany, int lowerRange, int upperRange) {
		ArrayList<Integer> list = new ArrayList<>();
		Random generator = new Random();
		for (int i = 0; i < howMany; i++) {
			int number = generator.nextInt(upperRange - lowerRange);
			int scaledNumber = number + lowerRange;
			list.add(scaledNumber);
		}
		return list;
	}

}
