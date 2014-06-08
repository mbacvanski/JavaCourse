package bicycles;

public class ATVBicycle implements WheeledVehicle {
	
	private int wheelNumber;
	private int gearNumber;
	private int seatNumber;
	private boolean brakes;
	
	public void setWheels(int wheels) {
		wheelNumber = wheels;
	}

	public void setGear(int gear) {
		gearNumber = gear;
	}

	public void setSeats(int seats) {
		seatNumber = seats;
	}

	public void brakes(boolean braking) {
		brakes = braking;
	}
	
	public void printStatus() {
		System.out.println("Number of wheels: " + wheelNumber);
		System.out.println("Current gear: " + gearNumber);
		System.out.println("Number of seats: " + seatNumber);
		System.out.println("Brakes applied: " + brakes);
	}
	
}
