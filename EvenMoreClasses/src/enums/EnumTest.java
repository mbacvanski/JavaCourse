package enums;

import java.util.Scanner;

public class EnumTest {
		
	enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a day of the week: ");
		String scanned = scan.nextLine().toUpperCase();
		String day = "";
		if (enumContains(scanned)) {
			System.out.println("The day of the week has been saved!");
			day = scanned;
		}
		else {
			System.out.println("The day that you entered is not valid.");
		}
		System.out.println("The day that you entered was: " + day);
		
		scan.close();
	}
	
	private static boolean enumContains(String s) {
		Day[] daysHere = Day.values();
		boolean contains = false;
		
		for (Day d : daysHere) {
			if (d.name().equals(s)) {
				contains = true;
			}
		}
		
		return contains;
	}

}
