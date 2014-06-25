package controlFlow;

public class Switches {

	private static final String INVALID_MONTH = "Invalid month";
	private static final String DECEMBER = "December";
	private static final String NOVEMBER = "November";
	private static final String OCTOBER = "October";
	private static final String SEPTEMBER = "September";
	private static final String JULY = "July";
	private static final String JUNE = "June";
	private static final String MAY = "May";
	private static final String APRIL = "April";
	private static final String MARCH = "March";
	private static final String FEBRUARY = "February";
	private static final String JANUARY = "January";
	private static final String AUGUST = "August";

	public static void main(String[] args) {
		int month = 42;
		String monthString;
		switch(month) {
			case 1: {monthString = JANUARY; break;}
			case 2: {monthString = FEBRUARY; break;}
			case 3: {monthString = MARCH; break;}
			case 4: {monthString = APRIL; break;}
			case 5: {monthString = MAY; break;}
			case 6: {monthString = JUNE; break;}
			case 7: {monthString = JULY; break;}
			case 8: {monthString = AUGUST; break;}
			case 9: {monthString = SEPTEMBER; break;}
			case 10: {monthString = OCTOBER; break;}
			case 11: {monthString = NOVEMBER; break;}
			case 12: {monthString = DECEMBER; break;}
			default: {monthString = INVALID_MONTH; break;}
			//Case statements!
		}
		System.out.println("The " + month + "th month in the year is " + monthString);
	}

}
