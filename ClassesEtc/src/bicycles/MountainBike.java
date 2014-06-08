package bicycles;

public class MountainBike extends Bicycle {
	
	int seatHeight;
	boolean trailer;
	
	public void raiseSeat(int inchesUp) {
		seatHeight += inchesUp;
	}
	
	public void lowerSeat(int inchesDown) {
		seatHeight -= inchesDown;
	}
	
	public void setTrailer(boolean state) {
		trailer = state;
	}
	
	public void printStates() {
		System.out.println("Cadence: " + cadence);
		System.out.println("Gear: " + gear);
		System.out.println("Speed: " + speed);
		System.out.println("Trailer: " + trailer);
		System.out.println("Seat Height: " + seatHeight);
	}
		
}
