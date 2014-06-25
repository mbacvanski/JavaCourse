package controlFlow;

public class StringSwitches {

	public static void main(String [] args) {
		
		int monthNumber = getMonthNumber("July");
		
		System.out.println("July is the " + monthNumber + " month in the year!");
	}

	private static int getMonthNumber(String month) {
		final String JANUARY = "january";
		final String FEBRUARY = "february";
		final String MARCH = "march";
		final String APRIL = "april";
		final String MAY = "may";
		final String JUNE = "june";
		final String JULY = "july";
		final String AUGUST = "august";
		final String SEPTEMBER = "september";
		final String OCTOBER	 = "october";
		final String NOVEMBER = "november";
		final String DECEMBER = "december";
		
		int monthNumber = 0;
		if (month == null) {
			return monthNumber;
		}
		
		switch (month.toLowerCase()) {
			case JANUARY: {monthNumber = 1; break;}
			case FEBRUARY: {monthNumber = 2; break;}
			case MARCH: {monthNumber = 3; break;}
			case APRIL: {monthNumber = 4; break;}
			case MAY: {monthNumber = 5; break;}
			case JUNE: {monthNumber = 6; break;}
			case JULY: {monthNumber = 7; break;}
			case AUGUST: {monthNumber = 8; break;}
			case SEPTEMBER: {monthNumber = 9; break;}
			case OCTOBER: {monthNumber = 10; break;}
			case NOVEMBER: {monthNumber = 11; break;}
			case DECEMBER: {monthNumber = 12; break;}
		}
		return monthNumber;
	}

}
